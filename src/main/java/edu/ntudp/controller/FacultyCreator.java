package edu.ntudp.controller;

import edu.ntudp.model.Faculty;
import edu.ntudp.model.Human;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;

public class FacultyCreator extends Faculty {
    private final ArrayList<GroupCreator> groupList;

    public void addGroup(GroupCreator group) {
        groupList.add(group);
    }

    public ArrayList<GroupCreator> getGroupList() {
        return this.groupList;
    }

    public FacultyCreator(String name, Human head) {
        setName(name);
        setHead(head);
        this.groupList = new ArrayList<>();
    }

    @Override
    public String toString() {
        JSONArray facultyJsonArray = new JSONArray();
        HashMap<String, Object> faculty = new HashMap<>();
        HashMap<String, Object> facultyData = new HashMap<>();
        JSONArray jsonArray = new JSONArray();
        for (GroupCreator groupCreator : groupList) {
            jsonArray.put(new JSONArray(groupCreator.toString()).get(0));
        }
        facultyData.put("groups", jsonArray);
        facultyData.put("head", getHead());
        faculty.put(getName(), facultyData);
        facultyJsonArray.put(faculty);

        return facultyJsonArray.toString();
    }
}
