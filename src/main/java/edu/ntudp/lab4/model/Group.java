package edu.ntudp.lab4.model;

import java.util.List;

public class Group extends StructureUnit<Student> {

    public Group(String name, Human head, List<Student> listChildStructures) {
        super(name, head, listChildStructures);
    }
}
