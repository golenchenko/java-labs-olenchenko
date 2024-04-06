package edu.ntudp.lab4.controller;

import edu.ntudp.lab4.model.Department;
import edu.ntudp.lab4.model.Faculty;
import edu.ntudp.lab4.model.Human;

import java.util.ArrayList;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head, ArrayList<Department> departments) {
        return new Faculty(name, head, departments);
    }
}
