package edu.ntudp.lab3.model;

import java.util.List;

public class Group extends StructureUnit<Student> {

    public Group(String name, Human head, List<Student> listChildStructures) {
        super(name, head, listChildStructures);
    }
}
