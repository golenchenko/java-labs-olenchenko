package edu.ntudp.controller;

import edu.ntudp.model.Human;
import edu.ntudp.model.Sex;
import edu.ntudp.model.Student;
import org.json.JSONArray;
import org.json.JSONObject;

public class StudentCreator extends Student {

    private final Human human;

    public StudentCreator(String firstName, String lastName, String middleName, Sex sex) {
        this.human = new Human();
        human.setFirstName(firstName);
        human.setLastName(lastName);
        human.setMiddleName(middleName);
        human.setSex(sex);
    }

    public StudentCreator(Human human) {
        this.human = human;
        human.setFirstName(human.getFirstName());
        human.setLastName(human.getLastName());
        human.setMiddleName(human.getMiddleName());
        human.setSex(human.getSex());
    }

    @Override
    public String toString() {
        return new JSONArray().put(new JSONObject(this.human)).toString();
    }
}
