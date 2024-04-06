package edu.ntudp.lab3.controller;

import edu.ntudp.lab3.model.Faculty;
import edu.ntudp.lab3.model.Human;
import edu.ntudp.lab3.model.University;

import java.util.ArrayList;

public class UniversityCreator {
    public University createUniversity(String name, Human head, ArrayList<Faculty> faculties) {
        return new University(name, head, faculties);
    }
}
