package com.yvonne.buyTicket0325;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;


    Station start;
    Station destination;
    int price;

    public Ticket(Station start, Station destination) {
        this.start = start;
        this.destination = destination;
        int diff = Math.abs(start.id - destination.id);
        System.out.println("diff: " + diff);
        switch (diff){
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;
        }
        /*if (start == Station.TAIPEI_STATION) {
            if (destination == Station.TAICHUNG_STATION) {
                price = 600;
            } else {
                price = 1500;
            }
        }
        else if(start == Station.TAICHUNG_STATION) {
                if (destination == Station.TAIPEI_STATION) {
                    price = 600;
                } else {
                    price = 900;
                }
        }
        else if(start == Station.KAOHSIUNG_STATION){
            if(destination == Station.TAIPEI_STATION){
                price = 1500;
            }
            else{
                price = 900;
            }
        }*/
    }

    public void print(){
        System.out.print(price);
    }
}




   /* public Ticket(Station start, Station destination){
        this.start = start;
        this.destination = destination;

        if(start.id==100 && destination.id==300){
            this.price=1500;
        }

        if(start.id == 100 && destination.id == 200){
            this.price = 600;
        }

        if(start.id == 200 && destination.id == 300){
            this.price = 900;
        }

        if(start.id==300 && destination.id==100){
            this.price=1500;
        }

        if(start.id == 200 && destination.id == 100){
            this.price = 600;
        }

        if(start.id == 300 && destination.id == 200){
            this.price = 900;
        }
    }

    public int getprice(int type) {
        if(type==2){
            this.price=(int)(this.price*0.8);
        }
        else if (type == 3){
            this.price = (int)(this.price*0.5);
        }
        else if(type == 4){
            this.price = (int)(this.price*0.9*2);
        }
        return this.price;
    }*/


