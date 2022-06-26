package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    public static Connection util() throws SQLException {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/mysql";
        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "root");

        conn = DriverManager.getConnection(url, info);
        return conn;
    }
}
