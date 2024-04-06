package edu.ntudp.lab4.controller;

import edu.ntudp.lab4.model.Faculty;
import edu.ntudp.lab4.model.Human;
import edu.ntudp.lab4.model.University;

import java.util.ArrayList;

public class UniversityCreator {
    public University createUniversity(String name, Human head, ArrayList<Faculty> faculties) {
        return new University(name, head, faculties);
    }
}
