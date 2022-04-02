package com.yvonne.score0311;

import java.util.ArrayList;

public class Scoring {
    public static void main(String[] args) {
        ArrayList<Student> score = new ArrayList<Student>();

        /*Student jack = new Student("Jack", 78, 62);
        Student hank = new Student("Hank", 60, 30);
        GraduateStudent jane = new GraduateStudent("Jane", 65, 82, 79);
        jack.print();
        hank.print();
        jane.print();*/

        score.add(new Student("Jack", 78, 62));
        score.add(new Student("Hank", 60, 30));
        score.add(new GraduateStudent("Jane", 65, 82, 79));
        for (int i = 0; i < 4; i++) {
            score.get(i).print();
        }
    }
}
