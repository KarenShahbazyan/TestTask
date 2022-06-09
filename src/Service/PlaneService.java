package Service;

import Model.Pleane;

import java.util.Scanner;

public class PlaneService {
    public Pleane parametrs() {
        Scanner air = new Scanner(System.in);
        System.out.println("Enter Name of Pleane: ");
        String name = air.next();
        System.out.println("Enter Country of Pleane: ");
        String country = air.next();
        System.out.println("Enter Year of Issue: ");
        int year = air.nextInt();
        System.out.println("Enter Hours in The Air: ");
        long hours = air.nextLong();
        System.out.println("Is it military or not: ");
        boolean military = air.next() == "y" ? true : false;
        System.out.println("Please enter weight of plane: ");
        int weight = air.nextInt();
        System.out.println("Enter Wingspan length: ");
        int wingsPane = air.nextInt();
        System.out.println("Enter Top speed of pleane: ");
        int speed = air.nextInt();
        System.out.println("Enter How Many seats it Have: ");
        int seats = air.nextInt();
        return new Pleane(name, country, year, hours, military, weight, wingsPane, speed, seats);
    }

    public void Pleanes(Pleane[] pleanes) {
        for (int i = 0; i < pleanes.length; i++) {
            Pleane p = pleanes[i];
            if (p.getYear() < 1903 || p.getYear() > 2023) {
                System.out.println("You Entered Wrong year! Please check:");
            } else if (p.getHour() < 0 || p.getHour() > 10000) {
                System.out.println("You Entered Wrong OR Higtest hours: ");
            }
            if (p.getWeight() < 10000 || p.getWeight() > 160000) {
                System.out.println("You Entered Wrong Weight: ");
            } else if (p.getWingsPane() < 10 || p.getWingsPane() > 45) {
                System.out.println("You entered Wrong info: ");
            }
            if (p.getTopSpeed() < 0) {
                System.out.println("not negative value: ");
            } else if (p.getSeats() < 0) {
                System.out.println("not negative value: ");
            } else if (p.getCost() < 0) {
                System.out.println("not negative value: ");
            } else {
                p.printInfo();
            }
        }
    }
//    public void isMilitary(Pleane[] pleanes){
//        for (int i = 0; i < pleanes.length; i++) {
//            if(){
//
//            }
//        }
//    }
}

