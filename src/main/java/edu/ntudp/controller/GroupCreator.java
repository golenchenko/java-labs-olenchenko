package edu.ntudp.controller;

import edu.ntudp.model.Group;
import edu.ntudp.model.Human;

public class GroupCreator {
    private FacultyCreator faculty;
    private Group group;

    public FacultyCreator getFacultyInstance() {
        return faculty;
    }

    public void setFacultyInstance(FacultyCreator faculty) {
        this.faculty = faculty;
    }

    public Group getGroup() {
        return group;
    }

    private void setGroup(Group group) {
        this.group = group;
    }

    public GroupCreator(FacultyCreator faculty, String groupName, Human headOfGroup) {
        Group group = new Group();
        setGroup(group);
        group.setName(groupName);
        group.setHead(headOfGroup);
        setFacultyInstance(faculty);
    }
}
