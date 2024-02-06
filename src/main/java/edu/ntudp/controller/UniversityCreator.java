package edu.ntudp.controller;

import edu.ntudp.model.Human;
import edu.ntudp.model.University;

public class UniversityCreator {
    private University university;

    public University getUniversity() {
        return university;
    }
    private void setUniversity(University university) {
        this.university = university;
    }

    public UniversityCreator(String name, Human head) {
        University university = new University();
        setUniversity(university);
        university.setName(name);
        university.setHead(head);
    }
}
