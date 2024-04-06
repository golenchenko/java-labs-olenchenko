package edu.ntudp.lab3.model;

public class Student extends Human {
    private String markBook;
    public String getMarkBook() {
        return markBook;
    }

    public void setMarkBook(String markBook) {
        this.markBook = markBook;
    }

    public Student(String firstName, String lastName, String middleName, Sex sex, String markBook) {
        super(firstName, lastName, middleName, sex);
        setMarkBook(markBook);
    }
}
