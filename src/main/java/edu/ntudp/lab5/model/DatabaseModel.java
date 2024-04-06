package edu.ntudp.lab5.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

public class DatabaseModel {
    private static final String DB_NAME = "database";
    private static final String DB_TABLE = "table";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    private static final String DB_SERVER = "localhost";
    private static final int DB_PORT = 3306;
    private static final String JDBC = "jdbc:mariadb://" + DB_SERVER + ":" + DB_PORT + "/"+DB_NAME+"?user="+DB_USER+"&password="+DB_PASSWORD;


    public DatabaseModel() {

    }
    public Connection connection(String server, int port, String db_name, String username, String password) throws SQLException, SQLTimeoutException {
        server = !server.isEmpty() ? server : DB_SERVER;
        db_name = !db_name.isEmpty()? db_name : DB_NAME;
        username = !username.isEmpty()? username : DB_USER;
        password = !password.isEmpty()? password : DB_PASSWORD;
        return DriverManager.getConnection("jdbc:mariadb://" + server + ":" + port + "/"+db_name+"?user="+username+"&password="+password);
    }
    public Connection connection(String jdbc) throws SQLException {
        jdbc = jdbc.isEmpty()? JDBC : jdbc;
        return DriverManager.getConnection(jdbc);
    }
    public void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
