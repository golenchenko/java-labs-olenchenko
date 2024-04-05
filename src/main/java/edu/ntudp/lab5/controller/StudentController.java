package edu.ntudp.lab5.controller;

import java.sql.*;

public class StudentController extends AbstractStudentController implements IStudentController {
    public StudentController(Connection connection, String tableName) {
        super(connection, tableName);
    }
    public void printStudentsByMonthBirthday(int month) {
//        2003-04-08
        String sqlQuery = "SELECT * FROM `"+this.getTableName()+"` WHERE MONTH(`birthday`) = " + month;
        getAndPrintData(sqlQuery);
    }
    public void printStudentsByBirthday(String yearMonthDay) {
//        2003-04-08
        String sqlQuery = "SELECT * FROM `"+this.getTableName()+"` WHERE `birthday` LIKE '%" + yearMonthDay + "%'";
        getAndPrintData(sqlQuery);
    }

    public void printStudentsByBirthday(int year, int month, int day) {
//        2003-04-08
        String date = year + "-" + month + "-" + day;
        String sqlQuery = "SELECT * FROM `"+this.getTableName()+"` WHERE `birthday` LIKE '%" + date + "%'";
        getAndPrintData(sqlQuery);
    }

    public void printStudentsByBirthday(int year, int month, int day, int hours, int minutes, int seconds) {
//        2003-04-08 18:29:33
        String date = year + "-" + month + "-" + day + " " + hours + ":" + minutes + ":" + seconds;
        String sqlQuery = "SELECT * FROM `"+this.getTableName()+"` WHERE `birthday` = '" + date + "'";
        getAndPrintData(sqlQuery);
    }

    @Override
    public void getAndPrintData(String sqlQuery) {
        try {
            Connection connection = this.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            for (int i = 1; i <= columnsNumber; i++) {
                String columnName = rsmd.getColumnName(i);
                if (i == 1) {
                    System.out.printf("%-10s", columnName);
                } else {
                    System.out.printf("%-20s", columnName);
                }
            }
            System.out.println();
            while (resultSet.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    String columnValue = resultSet.getString(i);
                    if (i == 1) {
                        System.out.printf("%-10s", columnValue);
                    } else {
                        System.out.printf("%-20s", columnValue);
                    }
                }
                System.out.println();
            }

            System.out.println();


            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
