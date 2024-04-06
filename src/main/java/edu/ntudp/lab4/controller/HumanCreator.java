package edu.ntudp.lab4.controller;

import edu.ntudp.lab4.model.Human;
import edu.ntudp.lab4.model.Sex;

public class HumanCreator {
    public Human createHuman(String firstName, String lastName, String middleName, Sex sex) {
        return new Human(firstName, lastName, middleName, sex);
    }
}
