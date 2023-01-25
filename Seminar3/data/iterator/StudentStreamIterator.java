package Seminar3.data.iterator;

import java.util.Iterator;

import Seminar3.data.GroupStream;
import Seminar3.data.StudentGroup;

public class StudentStreamIterator implements Iterator<StudentGroup> {

    private GroupStream groupStream;

    public StudentStreamIterator(GroupStream groupStream) {
        this.groupStream = groupStream;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public StudentGroup next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    public GroupStream getGroupStream() {
        return groupStream;
    }

    public void setGroupStream(GroupStream groupStream) {
        this.groupStream = groupStream;
    }

}
