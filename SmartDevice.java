/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author baraa
 */
public class SmartDevice extends SmartComponent{
    
    private String name;
    private double powerConsumption;
    private boolean isOn;

    public SmartDevice(String name, double powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " is turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " is turned OFF.");
    }

    @Override
    public void showStatus() {
        String status = isOn ? "ON" : "OFF";
        System.out.println("- " + name + " | Status: " + status);
    }

    @Override
    public double getPowerConsumption() {
        if (isOn) {
            return powerConsumption;
        }
        return 0;
    }
}
