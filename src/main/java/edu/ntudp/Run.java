package edu.ntudp;

import edu.ntudp.controller.*;
import edu.ntudp.model.Human;
import edu.ntudp.model.Sex;

public class Run {
    public static Human createHeadOfUniversity() {
        Human human = new Human();
        human.setFirstName("Азюковський");
        human.setMiddleName("Олександр");
        human.setLastName("Олександрович");
        human.setSex(Sex.MALE);
        return human;
    }
    public static Human createHeadOfDepartment() {
        Human human = new Human();
        human.setFirstName("Гнатушенко");
        human.setMiddleName("Володимир");
        human.setLastName("Володимирович");
        human.setSex(Sex.MALE);
        return human;
    }
    public static Human createHeadOfFaculty() {
        Human human = new Human();
        human.setFirstName("Удовик");
        human.setMiddleName("Ірина");
        human.setLastName("Михайлівна");
        human.setSex(Sex.FEMALE);
        return human;
    }
    public static Human createHeadOfGroup() {
        Human human = new Human();
        human.setFirstName("Квітка");
        human.setMiddleName("Денис");
        human.setLastName("Олександрович");
        human.setSex(Sex.MALE);
        return human;
    }
    public static Human createStudent(String firstName, String middleName, String lastName, Sex sex) {
        Human human = new Human();
        human.setFirstName(firstName);
        human.setMiddleName(middleName);
        human.setLastName(lastName);
        human.setSex(sex);
        return human;
    }
    public static void createTypicalUniversity() {
        Human headOfUniversity = createHeadOfUniversity();
        String universityName = "НТУ ДП";
        UniversityCreator universityCreator = new UniversityCreator(universityName, headOfUniversity);

        Human headOfDepartment = createHeadOfDepartment();
        String departmentName = "Інформаційні технології";
        DepartmentCreator departmentCreator = new DepartmentCreator(universityCreator, departmentName, headOfDepartment);

        Human headOfFaculty = createHeadOfFaculty();
        String facultyName = "Інформаційні технології та комп'ютерна інженерія";
        FacultyCreator facultyCreator = new FacultyCreator(departmentCreator, facultyName, headOfFaculty);

        Human headOfGroup = createHeadOfGroup();
        String groupName = "126-20-1";
        GroupCreator groupCreator = new GroupCreator(facultyCreator, groupName, headOfGroup);

        Human student = createStudent("Оленченко", "Георгій", "Михайлович", Sex.MALE);
        StudentCreator studentCreator = new StudentCreator(groupCreator, student);

        System.out.println(facultyCreator.getDepartmentInstance().getUniversityInstance().getUniversity().getName());
        System.out.println(studentCreator.getGroupInstance().getGroup().getHead().getFullName());

    }
}