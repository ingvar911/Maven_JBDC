package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String Url = "jdbc:mysql://localhost/MyFirstBase";
    private static final String User = "root";
    private static final String Password = "1r8C8%XJsSd!";
    private static Connection connection = null;

    public static Connection getConnect() {
        try {
            return DriverManager.getConnection(Url, User, Password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
