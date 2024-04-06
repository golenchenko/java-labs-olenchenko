package edu.ntudp.lab3.controller;

import edu.ntudp.lab3.model.Human;
import edu.ntudp.lab3.model.Sex;

public class PeopleCreator {
    public Human createHeadOfUniversity() {
        return new HumanCreator().createHuman("Азюковський", "Олександр", "Олександрович", Sex.MALE);
    }

    public  Human createHeadOfDepartment() {
        return new HumanCreator().createHuman("Гнатушенко", "Володимир", "Володимирович", Sex.MALE);
    }

    public  Human createHeadOfFaculty() {
        return new HumanCreator().createHuman("Удовик", "Ірина", "Михайлівна", Sex.MALE);
    }

    public  Human createHeadOfGroup() {
        return new HumanCreator().createHuman("Квітка", "Денис", "Олександрович", Sex.MALE);
    }
}
