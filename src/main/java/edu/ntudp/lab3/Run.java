package edu.ntudp.lab3;

import edu.ntudp.lab3.controller.*;
import edu.ntudp.lab3.model.*;
import edu.ntudp.lab3.model.Human;

import java.util.ArrayList;

public class Run {
    public University createTypicalUniversity() {
        PeopleCreator humanCreator = new PeopleCreator();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Group> groups = new ArrayList<>();
        ArrayList<Department> departments = new ArrayList<>();
        ArrayList<Faculty> faculties = new ArrayList<>();
        ArrayList<University> universities = new ArrayList<>();
        Student student = new StudentCreator().createStudent("Оленченко", "Георгій", "Михайлович", Sex.MALE, "12345678");
        Student student2 = new StudentCreator().createStudent("Тестовий", "Студент", "Данилович", Sex.MALE, "13747477");
        students.add(student);
        students.add(student2);
        Human headOfGroup = humanCreator.createHeadOfGroup();
        Group group = new GroupCreator().createGroup("126-20-1", headOfGroup, students);
        groups.add(group);

        Human headOfDepartment = humanCreator.createHeadOfDepartment();
        Department department = new DepartmentCreator().createDepartment("Інформаційні технології", headOfDepartment, groups);
        departments.add(department);

        Human headOfFaculty = humanCreator.createHeadOfFaculty();
        Faculty faculty = new FacultyCreator().createFaculty("Інформаційні технології та комп'ютерна інженерія", headOfFaculty, departments);
        faculties.add(faculty);

        Human headOfUniversity = humanCreator.createHeadOfUniversity();

        return new UniversityCreator().createUniversity("НТУ ДП", headOfUniversity, faculties);

    }
}