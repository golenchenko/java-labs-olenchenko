package edu.ntudp;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RunTest {

    @Test
    void createTypicalUniversity() {
        Run run = new Run();
        run.createTypicalUniversity();
        String oldUniversity = run.getUniversity();
        JsonManager fileManager = new JsonManager();
        try {
            fileManager.writeToFileJson(oldUniversity);

            String newUniversity = fileManager.readFromFileJson();
            assertEquals(newUniversity, oldUniversity);
        } catch (IOException e) {
            fail("Error: " + e);
        }
    }
}