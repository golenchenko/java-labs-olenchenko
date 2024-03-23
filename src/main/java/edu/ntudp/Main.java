package edu.ntudp;


import edu.ntudp.controller.StudentController;
import edu.ntudp.model.DatabaseModel;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    private static final String DB_NAME = "olenchenko";
    private static final String DB_USER = "olenchenko";
    private static final String DB_PASSWORD = "randompassword";
    private static final String DB_SERVER = "127.0.0.1";
    private static final int DB_PORT = 3307;
    private static final String DB_TABLE = "students";

    public static void main(String[] args) {
        DatabaseModel databaseModule = new DatabaseModel();
        Connection connection;
        try {
            connection = databaseModule.connection(DB_SERVER, DB_PORT, DB_NAME, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("Database connection failed");
            return;
        }
        String date = "2003-04-08";
        StudentController students = new StudentController(connection, DB_TABLE);
        students.printStudentsByBirthday(date);
        students.printStudentsByMonthBirthday(4);
        try {
            databaseModule.closeConnection(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}