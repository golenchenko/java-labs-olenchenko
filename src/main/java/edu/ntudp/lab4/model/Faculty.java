package edu.ntudp.lab4.model;

import java.util.List;

public class Faculty extends StructureUnit<Department> {
    public Faculty(String name, Human head, List<Department> listChildStructures) {
        super(name, head, listChildStructures);
    }
}
