package com.yvonne.buyTicket0325;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(1:Taipei , 2:Taichung , 3:Kaohsiung)");
        int start = scanner.nextInt();
        start*=100;
        System.out.println("Your destination station?(1:Taipei , 2:Taichung , 3:Kaohsiung)");
        int destination = scanner.nextInt();
        destination*=100;

        Ticket ticket = new Ticket(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);

    }
}
