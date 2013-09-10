/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DSA-David
 */
public class ConnectionFactory {

    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String bd = "OcpJavaSE";
    private static final String user = "root";
    private static final String pwd = "";

    public static Connection createConection() throws Exception{
        Connection c = null;
        try {
            c = DriverManager.getConnection(url + bd, user, pwd);
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        }
        return c;
    }
}
