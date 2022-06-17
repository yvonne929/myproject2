package com.yvonne.score0311;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFromFile {
    public static void main(String[] args) {
        //檔案名稱可能打錯，會找不到檔案，所以要除錯
        try{
            FileReader fileReader = new FileReader("scores.txt");
            /*顯示ASCII編號
            int data = fileReader.read();
            while (data != -1){
                System.out.println(data);
                data = fileReader.read();
            }
            */

            //顯示字串
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null){
                String[] token = line.split(",");
                String name =token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student student = new Student(name, english, math);
                student.print();
                line = reader.readLine();
            }
        }
        catch (FileNotFoundException exception){
            System.out.println("檔案讀取失敗");
        }
        catch (IOException exception){
            System.out.println("資料讀取失敗");
        }
        System.out.println("Testing");
    }
}
