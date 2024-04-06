package edu.ntudp.lab4.model;

import java.util.List;

public class Department extends StructureUnit<Group> {
    public Department(String name, Human head, List<Group> listChildStructures) {
        super(name, head, listChildStructures);
    }
}
