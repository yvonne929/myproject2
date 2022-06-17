package com.yvonne.score0311;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFromFile {
    public static void main(String[] args) {
        //檔案名稱可能打錯，會找不到檔案，所以要除錯
        try{
            FileReader fileReader = new FileReader("scores.txt");
            int data = fileReader.read();
            System.out.println(data);
            data = fileReader.read();
            System.out.println(data);
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
