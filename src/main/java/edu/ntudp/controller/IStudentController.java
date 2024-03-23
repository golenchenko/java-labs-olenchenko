package edu.ntudp.controller;

public interface IStudentController {
    void printStudentsByMonthBirthday(int month);
    void printStudentsByBirthday(String yearMonthDay);
    void printStudentsByBirthday(int year, int month, int day);
    void printStudentsByBirthday(int year, int month, int day, int hours, int minutes, int seconds);
}
