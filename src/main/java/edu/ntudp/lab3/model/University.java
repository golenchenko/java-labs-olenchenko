package edu.ntudp.lab3.model;

import java.util.List;

public class University extends StructureUnit<Faculty> {

    public University(String name, Human head, List<Faculty> listChildStructures) {
        super(name, head, listChildStructures);
    }
}
