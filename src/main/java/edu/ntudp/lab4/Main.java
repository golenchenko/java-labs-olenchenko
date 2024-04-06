package edu.ntudp.lab4;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import edu.ntudp.lab4.model.Group;
import edu.ntudp.lab4.model.University;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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