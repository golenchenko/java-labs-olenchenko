package edu.ntudp;

import edu.ntudp.controller.*;
import edu.ntudp.model.*;

public class Run {
    public String getUniversity() {
        return university;
    }
    private String university = "";
    public Run() {
    }
    public Human createHeadOfUniversity() {
        Human human = new Human();
        human.setFirstName("Азюковський");
        human.setMiddleName("Олександр");
        human.setLastName("Олександрович");
        human.setSex(Sex.MALE);
        return human;
    }

    public Human createHeadOfDepartment() {
        Human human = new Human();
        human.setFirstName("Гнатушенко");
        human.setMiddleName("Володимир");
        human.setLastName("Володимирович");
        human.setSex(Sex.MALE);
        return human;
    }

    public Human createHeadOfFaculty() {
        Human human = new Human();
        human.setFirstName("Удовик");
        human.setMiddleName("Ірина");
        human.setLastName("Михайлівна");
        human.setSex(Sex.FEMALE);
        return human;
    }

    public Human createHeadOfGroup() {
        Human human = new Human();
        human.setFirstName("Квітка");
        human.setMiddleName("Денис");
        human.setLastName("Олександрович");
        human.setSex(Sex.MALE);
        return human;
    }

    public Human createStudent(String firstName, String middleName, String lastName, Sex sex) {
        Human human = new Human();
        human.setFirstName(firstName);
        human.setMiddleName(middleName);
        human.setLastName(lastName);
        human.setSex(sex);
        return human;
    }

    public String createTypicalUniversity() {

        UniversityCreator oldUniversity = new UniversityCreator("НТУ ДП", this.createHeadOfUniversity());


        DepartmentCreator department = new DepartmentCreator("Інформаційні технології", this.createHeadOfDepartment());
        FacultyCreator faculty = new FacultyCreator("Інформаційні технології та комп'ютерна інженерія", this.createHeadOfFaculty());
        GroupCreator groupOneFaculty = new GroupCreator("126-20-1", this.createHeadOfGroup());
        StudentCreator studentOneGroupFaculty = new StudentCreator(createStudent("Жабченко", "Іван", "Адамович", Sex.MALE));
        StudentCreator studentTwoGroupFaculty = new StudentCreator(createStudent("Оленченко", "Георгій", "Михайлович", Sex.MALE));

        GroupCreator groupTwoFaculty = new GroupCreator("172-18-2", new Human("Velma", "G", "Khah", Sex.FEMALE));
        StudentCreator studentOneGroupTwoFaculty = new StudentCreator(createStudent("Іваничук", "Сергій", "Данилович", Sex.MALE));
        StudentCreator studentTwoGroupTwoFaculty = new StudentCreator(createStudent("Загребуща", "Олена", "Вікторівна", Sex.FEMALE));

        groupTwoFaculty.addStudent(studentOneGroupTwoFaculty);
        groupTwoFaculty.addStudent(studentTwoGroupTwoFaculty);
        groupOneFaculty.addStudent(studentOneGroupFaculty);
        groupOneFaculty.addStudent(studentTwoGroupFaculty);
        faculty.addGroup(groupOneFaculty);
        faculty.addGroup(groupTwoFaculty);


        FacultyCreator facultyTwo = new FacultyCreator("Second Faculty", new Human("Fatima", "O", "Dunlap", Sex.FEMALE));
        GroupCreator groupOneFacultyTwo = new GroupCreator("101-19-4", new Human("Rajan", "L", "Hurst", Sex.MALE));
        StudentCreator studentOneGroupOneFacultyTwo = new StudentCreator(createStudent("Бурячок", "Яна", "Володимирівна", Sex.FEMALE));
        StudentCreator studentTwoGroupOneFacultyTwo = new StudentCreator(createStudent("Чубатенко", "Лариса", "Андріївна", Sex.FEMALE));

        GroupCreator groupTwoFacultyTwo = new GroupCreator("101-19-5", new Human("Cameron", "Q", "Kein", Sex.MALE));
        StudentCreator studentOneGroupTwoFacultyTwo = new StudentCreator(createStudent("Юровський", "Семен", "Олегович", Sex.MALE));
        StudentCreator studentTwoGroupTwoFacultyTwo = new StudentCreator(createStudent("Бочок", "Ярослав", "Андрійович", Sex.FEMALE));

        groupTwoFacultyTwo.addStudent(studentOneGroupTwoFacultyTwo);
        groupTwoFacultyTwo.addStudent(studentTwoGroupTwoFacultyTwo);
        groupOneFacultyTwo.addStudent(studentOneGroupOneFacultyTwo);
        groupOneFacultyTwo.addStudent(studentTwoGroupOneFacultyTwo);
        facultyTwo.addGroup(groupOneFacultyTwo);
        facultyTwo.addGroup(groupTwoFacultyTwo);

        department.addFaculty(faculty);
        department.addFaculty(facultyTwo);



        DepartmentCreator departmentTwo = new DepartmentCreator("Second Department", new Human("Yasmin", "M", "Meza", Sex.FEMALE));
        FacultyCreator facultyDepartmentTwo = new FacultyCreator("Кібербезпека", this.createHeadOfFaculty());
        GroupCreator groupOneFacultyDepartmentTwo = new GroupCreator("125-20-1", this.createHeadOfGroup());
        StudentCreator studentOneGroupFacultyDepartmentTwo = new StudentCreator(createStudent("Smith", "John", "Adam", Sex.MALE));
        StudentCreator studentTwoGroupFacultyDepartmentTwo = new StudentCreator(createStudent("Johnson", "George", "Michael", Sex.MALE));

        GroupCreator groupTwoFacultyDepartmentTwo = new GroupCreator("125-18-2", new Human("Jane", "G", "Doe", Sex.FEMALE));
        StudentCreator studentOneGroupTwoFacultyDepartmentTwo = new StudentCreator(createStudent("Williams", "Sergey", "Daniel", Sex.MALE));
        StudentCreator studentTwoGroupTwoFacultyDepartmentTwo = new StudentCreator(createStudent("Davis", "Olivia", "Victoria", Sex.FEMALE));

        groupTwoFacultyDepartmentTwo.addStudent(studentOneGroupTwoFacultyDepartmentTwo);
        groupTwoFacultyDepartmentTwo.addStudent(studentTwoGroupTwoFacultyDepartmentTwo);
        groupOneFacultyDepartmentTwo.addStudent(studentOneGroupFacultyDepartmentTwo);
        groupOneFacultyDepartmentTwo.addStudent(studentTwoGroupFacultyDepartmentTwo);
        facultyDepartmentTwo.addGroup(groupOneFacultyDepartmentTwo);
        facultyDepartmentTwo.addGroup(groupTwoFacultyDepartmentTwo);


        FacultyCreator facultyTwoDepartmentTwo = new FacultyCreator("Second Faculty", new Human("Emily", "O", "Jones", Sex.FEMALE));
        GroupCreator groupOneFacultyTwoDepartmentTwo = new GroupCreator("117-19-4", new Human("David", "L", "Brown", Sex.MALE));
        StudentCreator studentOneGroupOneFacultyTwoDepartmentTwo = new StudentCreator(createStudent("Taylor", "Yana", "Vladimir", Sex.FEMALE));
        StudentCreator studentTwoGroupOneFacultyTwoDepartmentTwo = new StudentCreator(createStudent("Martinez", "Larisa", "Andrey", Sex.FEMALE));

        GroupCreator groupTwoFacultyTwoDepartmentTwo = new GroupCreator("123-19-5", new Human("Andrew", "Q", "Clark", Sex.MALE));
        StudentCreator studentOneGroupTwoFacultyTwoDepartmentTwo = new StudentCreator(createStudent("Anderson", "Simon", "Oleg", Sex.MALE));
        StudentCreator studentTwoGroupTwoFacultyTwoDepartmentTwo = new StudentCreator(createStudent("Thomas", "Yaroslav", "Andriy", Sex.FEMALE));

        groupTwoFacultyTwoDepartmentTwo.addStudent(studentOneGroupTwoFacultyTwoDepartmentTwo);
        groupTwoFacultyTwoDepartmentTwo.addStudent(studentTwoGroupTwoFacultyTwoDepartmentTwo);
        groupOneFacultyTwoDepartmentTwo.addStudent(studentOneGroupOneFacultyTwoDepartmentTwo);
        groupOneFacultyTwoDepartmentTwo.addStudent(studentTwoGroupOneFacultyTwoDepartmentTwo);
        facultyTwoDepartmentTwo.addGroup(groupOneFacultyTwoDepartmentTwo);
        facultyTwoDepartmentTwo.addGroup(groupTwoFacultyTwoDepartmentTwo);

        departmentTwo.addFaculty(facultyDepartmentTwo);
        departmentTwo.addFaculty(facultyTwoDepartmentTwo);


        oldUniversity.addDepartment(department);
        oldUniversity.addDepartment(departmentTwo);

        this.university = oldUniversity.toString();
        return oldUniversity.toString();

    }
}