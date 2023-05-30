package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String url = "jdbc:mysql://localhost/MyFirstBase";
    private static String user = "root";
    private static String pass = "1r8C8%XJsSd!";
    private static Connection connection = null;

    public static Connection getConnect() {
        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
