package edu.ntudp.controller;

import edu.ntudp.model.Department;
import edu.ntudp.model.Human;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DepartmentCreator extends Department {

    public List<FacultyCreator> getFacultyList() {
        return facultyList;
    }

    private final List<FacultyCreator> facultyList;


    public void addFaculty(FacultyCreator faculty) {
        facultyList.add(faculty);
    }

    public DepartmentCreator(String name, Human head) {
        setName(name);
        setHead(head);
        this.facultyList = new ArrayList<>();
    }

    @Override
    public String toString() {
        JSONArray departmentJsonArray = new JSONArray();
        HashMap<String, Object> department = new HashMap<>();
        HashMap<String, Object> departmentData = new HashMap<>();

        JSONArray jsonArray = new JSONArray();
        for (FacultyCreator facultyCreator : facultyList) {
            jsonArray.put(new JSONArray(facultyCreator.toString()).get(0));
        }
        departmentData.put("faculties", jsonArray);
        departmentData.put("head", getHead());
        department.put(getName(), departmentData);
        departmentJsonArray.put(department);
        return departmentJsonArray.toString();
    }
}
