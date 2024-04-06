package edu.ntudp.lab4.model;

public abstract class Pupil implements IPupil {

    private String name;
    private Human head;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Human getHead() {
        return head;
    }

    @Override
    public void setHead(Human head) {
        this.head = head;
    }
}
