package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost/MyFirstBase";
    private static final String USER = "root";
    private static final String PASSWORD = "1r8C8%XJsSd!";
    private static Connection connection = null;

    public static Connection getConnect() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
