package com.yvonne.score0311;

public class GraduateStudent extends Student{
    int thesis;
    public GraduateStudent(String name,int english,int math,int thesis){
        super(name, english, math);
        this.thesis = thesis;
    }
    @Override//覆寫Student類別裡的function,而Student裡的print是實作Printable的print
    public void print() {
        System.out.println(name+"\t"+english+"\t"+
                math + "\t" + getAverage() + "\t" + thesis);
    }
}
