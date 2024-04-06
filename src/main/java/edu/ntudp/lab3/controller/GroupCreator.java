package edu.ntudp.lab3.controller;

import edu.ntudp.lab3.model.Group;
import edu.ntudp.lab3.model.Human;
import edu.ntudp.lab3.model.Student;

import java.util.ArrayList;


public class GroupCreator {
    public Group createGroup(String name, Human head, ArrayList<Student> students) {
        return new Group(name, head, students);
    }
}
