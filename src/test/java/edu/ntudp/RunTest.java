package edu.ntudp;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import edu.ntudp.lab4.JsonManager;
import edu.ntudp.lab4.Run;
import edu.ntudp.lab4.model.University;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RunTest {

    @Test
    void createTypicalUniversity() {
        University university = new Run().createTypicalUniversity();
        JsonManager jsonManager = new JsonManager();
        try {
            jsonManager.writeToFileJson(university, "university.json");
        } catch (IOException e) {
            fail(e.getMessage());
            throw new RuntimeException(e);
        }
        University university2;
        try {
            university2 = jsonManager.readFromFileJson("university.json", University.class);
        } catch (FileNotFoundException e) {
            fail(e.getMessage());
            throw new RuntimeException(e);
        }
        assertEquals(jsonManager.toString(university), jsonManager.toString(university2));

    }
}