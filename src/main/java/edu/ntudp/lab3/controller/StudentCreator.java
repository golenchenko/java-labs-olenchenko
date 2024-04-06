package edu.ntudp.lab3.controller;

import edu.ntudp.lab3.model.Human;
import edu.ntudp.lab3.model.Sex;
import edu.ntudp.lab3.model.Student;

public class StudentCreator  {
    public Student createStudent(String firstName, String lastName, String middleName, Sex sex, String markBook) {
        HumanCreator humanCreator = new HumanCreator();
        Human human = humanCreator.createHuman(firstName, lastName, middleName, sex);
        return new Student(human.getFirstName(), human.getLastName(), human.getMiddleName(), human.getSex(), markBook);
    }
}
