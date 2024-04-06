package edu.ntudp.lab4.controller;

import edu.ntudp.lab4.model.Human;
import edu.ntudp.lab4.model.Sex;
import edu.ntudp.lab4.model.Student;

public class StudentCreator  {
    public Student createStudent(String firstName, String lastName, String middleName, Sex sex, String markBook) {
        HumanCreator humanCreator = new HumanCreator();
        Human human = humanCreator.createHuman(firstName, lastName, middleName, sex);
        return new Student(human.getFirstName(), human.getLastName(), human.getMiddleName(), human.getSex(), markBook);
    }
}
