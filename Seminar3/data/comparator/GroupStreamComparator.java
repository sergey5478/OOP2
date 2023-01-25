package Seminar3.data.comparator;

import java.util.Comparator;

import Seminar3.data.GroupStream;

public class GroupStreamComparator implements Comparator<GroupStream> {

    @Override
    public int compare(GroupStream studentGroup1, GroupStream studentGroup2) {
        // int sizeStudentGroup1 = studentGroup1.getStudentGroup().size();
        // int sizeStudentGroup2 = studentGroup2.getStudentGroup().size();
        return Integer.compare(studentGroup1.getStudentGroup().size(),
        studentGroup2.getStudentGroup().size());
    }

}
