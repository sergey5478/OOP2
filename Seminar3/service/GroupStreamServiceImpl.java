package Seminar3.service;

import java.util.Collections;
import java.util.List;

import Seminar3.data.GroupStream;
import Seminar3.data.comparator.GroupStreamComparator;

public class GroupStreamServiceImpl implements StudentStreamInterf {

    @Override
    public void groupStreamSort(List<GroupStream> groupStreams) {
        Collections.sort(groupStreams, new GroupStreamComparator());

    }

}
