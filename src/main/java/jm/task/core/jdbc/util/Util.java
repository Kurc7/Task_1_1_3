package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {

    private static final String url = "jdbc:mysql://localhost:3306/mysql";
    private static final String pass = "root";
    private static final String user = "root";
    private static Connection conn = null;

    public static Connection util() throws SQLException {

        Properties info = new Properties();
        info.put("user", user);
        info.put("password", pass);

        conn = DriverManager.getConnection(url, info);
        return conn;
    }

    public static void close(){
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
