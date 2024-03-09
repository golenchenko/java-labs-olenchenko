package edu.ntudp;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class JsonManager {
    public JsonManager() {

    }
    public void writeToFileJson(String university) throws IOException {
        try (Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("./university.json"), StandardCharsets.UTF_8))) {
            out.write(university);
//            System.out.println("Successfully Copied JSON Object to File...");
        }
    }
    public String readFromFileJson(String filePath) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath, StandardCharsets.UTF_8));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line).append("\n");
        }
        bufferedReader.close();
        // Remove the final '\n' only if the StringBuilder is not empty
        if (!stringBuilder.isEmpty()) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }

        return stringBuilder.toString();
    }
    public String readFromFileJson() throws IOException {
        return readFromFileJson("./university.json");
    }
}
