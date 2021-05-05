package com.pet.project.cinemacms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDCConnection {

    private static Connection connection;

    public static  Connection createConnection() {
        String userName = "root";
        String password = "aaaa";
        String connectionURL = "jdbc:mysql://localhost:3306/springDB";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String trueConnect = "--------------------connection true--------------------";

        if (connection == null) {
            try {
                connection = DriverManager.getConnection(connectionURL, userName, password);
                System.out.println(trueConnect);
                return connection;
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }

        return connection;
    }
}




