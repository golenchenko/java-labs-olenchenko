package edu.ntudp;

import org.json.JSONArray;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Run run = new Run();
        run.createTypicalUniversity();
        String university = run.getUniversity();
        JsonManager fileManager = new JsonManager();
        try {
            fileManager.writeToFileJson(university);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        try {
            String json = fileManager.readFromFileJson();
            System.out.println(json.equals(university)); // true
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}