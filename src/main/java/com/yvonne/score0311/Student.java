package com.yvonne.score0311;

public class Student implements Printable{
    /*1
     2 -> 1
     3 -> 2 -> 1*/
    String name;
    int english;
    int math;

    public Student(String name) {// 1
        this.name = name;
    }

    public Student(String name, int english, int math){// 2
        this(name);
        //把name再丟回去Student這個class

        //this.name = name;
        this.english = english;
        this.math = math;
    }

    public Student() {// 3
        this("John Doe", -1, -1);
        /*name = "John Doe";
        english = -1;
        math = -1;*/
    }
    public void print(){
        System.out.print(name + "\t" + english + "\t" + math +"\t" + getAverage());
        if (getAverage() < 60){
            System.out.print("*");
        }
        System.out.println();
    }

    /*public void print() {
        System.out.print(name + "\t" + english + "\t" + math +"\t" + getAverage());
        if (getAverage() < 60){
            System.out.print("*");
        }
        System.out.println();
    }*/

    public int getAverage() {
        return (english+math)/2;
    }
}
