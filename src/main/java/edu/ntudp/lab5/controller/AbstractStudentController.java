package edu.ntudp.lab5.controller;

import java.sql.*;

public abstract class AbstractStudentController {

    private Connection connection;
    private String tableName;
    public String getTableName() {
        return tableName;
    }
    public AbstractStudentController(Connection connection, String tableName) {
        setConnection(connection);
        setTableName(tableName);
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public abstract void getAndPrintData(String sqlQuery);
}
