package edu.ntudp.controller;

import edu.ntudp.model.Group;
import edu.ntudp.model.Human;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupCreator extends Group {
    private final List<StudentCreator> students;

    public void addStudent(StudentCreator student) {
        students.add(student);
    }

    public List<StudentCreator> getStudentsList() {
        return students;
    }

    public GroupCreator(String name, Human head) {
        setName(name);
        setHead(head);
        this.students = new ArrayList<>();
    }

    @Override
    public String toString() {
        JSONArray groupJsonArray = new JSONArray();
        HashMap<String, Object> group = new HashMap<>();
        JSONArray jsonArray = new JSONArray();

        for (StudentCreator student : students) {
            jsonArray.put(new JSONArray(student.toString()).get(0));
        }
        group.put("head", getHead());
        group.put("students", jsonArray);
        groupJsonArray.put(group);
        return groupJsonArray.toString();
    }
}
