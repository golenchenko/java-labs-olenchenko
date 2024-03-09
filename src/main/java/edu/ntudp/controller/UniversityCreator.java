package edu.ntudp.controller;

import edu.ntudp.model.Human;
import edu.ntudp.model.University;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniversityCreator extends University {
    private final List<DepartmentCreator> departmentList;

    public List<DepartmentCreator> getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(DepartmentCreator department) {
        departmentList.add(department);
    }

    public UniversityCreator(String name, Human head) {
        setName(name);
        setHead(head);
        this.departmentList = new ArrayList<>();
    }

    @Override
    public String toString() {
        JSONArray universityJsonArray = new JSONArray();
        HashMap<String, Object> university = new HashMap<>();
        HashMap<String, Object> universityData = new HashMap<>();

        JSONArray jsonArray = new JSONArray();
        for (DepartmentCreator departmentCreator : departmentList) {
            jsonArray.put(new JSONArray(departmentCreator.toString()).get(0));
        }
        universityData.put("departments", jsonArray);
        universityData.put("head", getHead());
        university.put(getName(), universityData);
        universityJsonArray.put(university);
        return universityJsonArray.toString();
    }
}
