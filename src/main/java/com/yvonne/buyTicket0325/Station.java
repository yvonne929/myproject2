package com.yvonne.buyTicket0325;

public class Station {
    public static final Station TAIPEI_STATION = new Station(100,"Taipei");
    public static final Station TAICHUNG_STATION = new Station(200,"Taichung");
    public static final Station KAOHSIUNG_STATION = new Station(400,"kaohsiung");

    int id;
    String name;
    public Station(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
