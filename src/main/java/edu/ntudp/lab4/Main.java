package edu.ntudp.lab4;

import edu.ntudp.lab3.Run;
import edu.ntudp.lab3.model.University;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        University university = new Run().createTypicalUniversity();
        JsonManager jsonManager = new JsonManager();
        try {
            jsonManager.writeToFileJson(university, "university.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        University university2;
        try {
            university2 = jsonManager.readFromFileJson("university.json", University.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}