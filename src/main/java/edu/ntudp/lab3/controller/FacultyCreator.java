package edu.ntudp.lab3.controller;

import edu.ntudp.lab3.model.Department;
import edu.ntudp.lab3.model.Faculty;
import edu.ntudp.lab3.model.Human;

import java.util.ArrayList;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head, ArrayList<Department> departments) {
        return new Faculty(name, head, departments);
    }
}
