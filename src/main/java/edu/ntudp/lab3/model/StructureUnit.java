package edu.ntudp.lab3.model;

import java.util.List;
import java.util.Objects;

public abstract class StructureUnit<T> {

    private String name;
    private Human head;

    public List<T> getListChildStructures() {
        return listChildStructures;
    }

    public StructureUnit(String name, Human head, List<T> listChildStructures) {
        this.name = name;
        this.head = head;
        this.listChildStructures = listChildStructures;
    }

    public void setListChildStructures(List<T> listChildStructures) {
        this.listChildStructures = listChildStructures;
    }

    private List<T> listChildStructures;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, head, listChildStructures);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StructureUnit<?> other = (StructureUnit<?>) obj;
        Boolean one = Objects.equals(name, other.name);
        Boolean two = Objects.equals(head, other.head);
        Boolean three = Objects.equals(listChildStructures, other.listChildStructures);
        return Objects.equals(name, other.name) &&
                Objects.equals(head, other.head) &&
                Objects.equals(listChildStructures, other.listChildStructures);
    }
}
