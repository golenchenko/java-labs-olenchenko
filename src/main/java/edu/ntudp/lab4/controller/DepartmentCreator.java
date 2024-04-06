package edu.ntudp.lab4.controller;

import edu.ntudp.lab4.model.Department;
import edu.ntudp.lab4.model.Group;
import edu.ntudp.lab4.model.Human;

import java.util.ArrayList;

public class DepartmentCreator  {
    public Department createDepartment(String name, Human head, ArrayList<Group> groups) {
        return new Department(name, head, groups);
    }
}
