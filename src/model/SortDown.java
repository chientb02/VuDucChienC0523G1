package model;

import java.util.Comparator;

public class SortDown implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o2.getAverageScore() - o1.getAverageScore());
    }
}
