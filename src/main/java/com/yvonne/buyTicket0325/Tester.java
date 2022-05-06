package com.yvonne.buyTicket0325;

import java.util.Scanner;
        /*台北(100) -> 台中 $500
         台中(200) -> 高雄 $600
         台北 -> 高雄(400) $1100
        */

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(1:Taipei , 2:Taichung , 3:Kaohsiung)");
        int choose = Integer.parseInt(scanner.next());
        Station start = null;
        switch (choose){
            case 1:
                start = Station.TAIPEI_STATION;
                break;
            case 2:
                start = Station.TAICHUNG_STATION;
                break;
            case 3:
                start = Station.KAOHSIUNG_STATION;
                break;
        }

        System.out.println("Your destination station?(1:Taipei , 2:Taichung , 3:Kaohsiung)");
        choose = Integer.parseInt(scanner.next());
        Station destination = null;
        switch (choose){
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
            case 3:
                destination = Station.KAOHSIUNG_STATION;
                break;
        }

        System.out.println("what type is your ticket?(1:regular , 2:student , 3:senior , 4.round)");
        choose = Integer.parseInt(scanner.next());
        Ticket ticket = null;
        switch (choose){
            case 1:
                ticket = new Ticket(start,destination);
                break;
            case 2:
                ticket = new StudentTicket(start,destination);
                break;
            case 3:
                ticket = new SeniorTicket(start,destination);
                break;
            case 4:
                ticket = new RoundTicket(start,destination);
                break;
        }
        ticket.print();
        /*int total=0;
        int regular=0,student=0,senior=0,round=0;
        int regularNum=0,studentNum=0,seniorNum=0,roundNum=0;
        while (true) {
            System.out.println("Your start station?(enter 0 to stop)(1:Taipei , 2:Taichung , 3:Kaohsiung)");
            int start = scanner.nextInt();
            if(start==0){
                System.out.println("regular"+regularNum+"p"+regular+"dollars");
                System.out.println("student"+studentNum+"p"+student+"dollars");
                System.out.println("senior"+seniorNum+"p"+senior+"dollars");
                System.out.println("round"+roundNum+"p"+round+"dollars");
                System.out.println("the total price is: " + total);
                break;
            }

            System.out.println("Your destination station?(1:Taipei , 2:Taichung , 3:Kaohsiung)");
            int destination = scanner.nextInt();

            System.out.println("what type is your ticket?(1.regular , 2.student , 3.senior , 4.round)");
            int type = scanner.nextInt();

            System.out.println("How many tickets?");
            int number = scanner.nextInt();

            int price;
            Station A=null ,B=null;
            if (start == 1 && destination == 3) {
                A=Station.TAIPEI_STATION;
                B=Station.KAOHSIUNG_STATION;
            }
            else if (start == 1 && destination == 2) {
                A=Station.TAIPEI_STATION;
                B=Station.TAICHUNG_STATION;
            }
            else if (start == 2 && destination == 1) {
                A=Station.TAICHUNG_STATION;
                B=Station.TAIPEI_STATION;
            }
            else if (start == 3 && destination == 1) {
                A=Station.KAOHSIUNG_STATION;
                B=Station.TAIPEI_STATION;
            }
            else if (start == 2 && destination == 3) {
                A=Station.TAICHUNG_STATION;
                B=Station.KAOHSIUNG_STATION;
            }
            else if (start == 3 && destination == 2) {
                A=Station.KAOHSIUNG_STATION;
                B=Station.TAICHUNG_STATION;
            }

            Ticket ticket = new Ticket(A, B);
            price=ticket.getprice(type) * number;
            System.out.println("the price is: "+price);
           // total+=price;
            if (type==1){
                regular+=price;
                regularNum++;
            }
            else if(type==2){
                student+=price;
                studentNum++;
            }
            else if(type == 3){
                senior+=price;
                seniorNum++;
            }
            else if(type == 4){
                round+=price;
                roundNum++;
            }
        }*/
    }
}
