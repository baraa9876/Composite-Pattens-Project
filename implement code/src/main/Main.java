/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author baraa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SmartComponent smartHome = new SmartGroup("Smart Home");

        SmartComponent firstFloor = new SmartGroup("First Floor");
        SmartComponent secondFloor = new SmartGroup("Second Floor");

        SmartComponent livingRoom = new SmartGroup("Living Room");
        SmartComponent kitchen = new SmartGroup("Kitchen");
        SmartComponent bedroom = new SmartGroup("Bedroom");
        SmartComponent securityArea = new SmartGroup("Security Area");

        SmartComponent livingRoomLight =
                new SmartDevice("Living Room Light", 15);

        SmartComponent smartTV =
                new SmartDevice("Smart TV", 120);

        SmartComponent airConditioner =
                new SmartDevice("Air Conditioner", 1500);

        SmartComponent kitchenLight =
                new SmartDevice("Kitchen Light", 12);

        SmartComponent smartOven =
                new SmartDevice("Smart Oven", 900);

        SmartComponent bedroomLight =
                new SmartDevice("Bedroom Light", 10);

        SmartComponent heater =
                new SmartDevice("Heater", 700);

        SmartComponent securityCamera =
                new SmartDevice("Security Camera", 25);

        SmartComponent smartDoorLock =
                new SmartDevice("Smart Door Lock", 8);


        livingRoom.add(livingRoomLight);
        livingRoom.add(smartTV);
        livingRoom.add(airConditioner);

        kitchen.add(kitchenLight);
        kitchen.add(smartOven);

        bedroom.add(bedroomLight);
        bedroom.add(heater);

        securityArea.add(securityCamera);
        securityArea.add(smartDoorLock);


        firstFloor.add(livingRoom);
        firstFloor.add(kitchen);

        secondFloor.add(bedroom);
        secondFloor.add(securityArea);


        smartHome.add(firstFloor);
        smartHome.add(secondFloor);


        System.out.println("========== SMART HOME CONTROL SYSTEM ==========");

        smartHome.showStatus();

        smartHome.turnOn();

        smartHome.showStatus();

        System.out.println(
                "\nTotal Current Power Consumption: "
                        + smartHome.getPowerConsumption()
                        + " Watts"
        );

        secondFloor.turnOff();

        smartHome.showStatus();

        System.out.println(
                "Total Current Power Consumption After Turning OFF Second Floor: "
                        + smartHome.getPowerConsumption()
                        + " Watts"
        );
    }
    
}
