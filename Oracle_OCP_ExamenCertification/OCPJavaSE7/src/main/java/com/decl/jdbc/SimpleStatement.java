/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DSA-David
 */
public class SimpleStatement {

    private Connection connection;
    private Statement statement;

    public void ejecutaConsultaSelect() {
        connection = ConnectionFactory.createConection();
        try {
            statement = connection.createStatement();
            ResultSet rs =statement.executeQuery("SELECT * FROM usuario");
            while(rs.next()){
                System.out.println("Columna id: "+rs.getString("id"));
                System.out.println("Columna nombre: "+rs.getString("nombre"));
                System.out.println("Columna ssn: "+rs.getString("ssn"));
                System.out.println("");
            }
        } catch (SQLException sqle) {
            for(StackTraceElement stre: sqle.getStackTrace()){
                System.out.println("Stre: "+stre.toString());
            }
        }
    }
    public void ejecutaConsultaInsert(){
        connection = ConnectionFactory.createConection();
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs =statement.executeQuery("SELECT * FROM usuario");
            rs.moveToInsertRow();
            rs.updateInt("id",3);
            rs.updateString("nombre","Esteban");
            rs.updateString("ssn","3060660832");
            rs.insertRow();
            System.out.println("");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
     public void ejecutaConsultaUpdate(){
        connection = ConnectionFactory.createConection();
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs =statement.executeQuery("SELECT * FROM usuario");
            rs.absolute(1);
            rs.updateString("nombre","Dave");
            rs.updateString("ssn","30303263");
            rs.updateRow();
            System.out.println("");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
     public void ejecutaConsultaDelete(){
        connection = ConnectionFactory.createConection();
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs =statement.executeQuery("SELECT * FROM usuario");
            rs.absolute(1);
            rs.deleteRow();
            System.out.println("");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new SimpleStatement().ejecutaConsultaSelect();
    }
    
}
