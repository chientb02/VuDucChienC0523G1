package model;

import java.util.Comparator;

public class SortUp implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getAverageScore() - o2.getAverageScore());
    }
}
