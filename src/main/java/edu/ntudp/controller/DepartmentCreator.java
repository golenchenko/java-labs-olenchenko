package edu.ntudp.controller;

import edu.ntudp.model.Department;
import edu.ntudp.model.Human;

public class DepartmentCreator  {
    private UniversityCreator university;
    private Department department;
    public UniversityCreator getUniversityInstance() {
        return university;
    }

    public void setUniversityInstance(UniversityCreator university) {
        this.university = university;
    }

    public Department getDepartment() {
        return department;
    }

    private void setDepartment(Department department) {
        this.department = department;
    }

    public DepartmentCreator(UniversityCreator university, String departmentName, Human headOfDepartment) {
        Department department = new Department();
        setDepartment(department);
        department.setName(departmentName);
        department.setHead(headOfDepartment);
        setUniversityInstance(university);
    }
}