package edu.ntudp.lab3.controller;

import edu.ntudp.lab3.model.Department;
import edu.ntudp.lab3.model.Group;
import edu.ntudp.lab3.model.Human;

import java.util.ArrayList;

public class DepartmentCreator  {
    public Department createDepartment(String name, Human head, ArrayList<Group> groups) {
        return new Department(name, head, groups);
    }
}
