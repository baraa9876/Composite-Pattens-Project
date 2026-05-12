/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author baraa
 */
public class SmartGroup extends SmartComponent{

    private String name;
    private List<SmartComponent> components;

    public SmartGroup(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(SmartComponent component) {
        components.add(component);
    }

    @Override
    public void remove(SmartComponent component) {
        components.remove(component);
    }

    @Override
    public void turnOn() {
        System.out.println("\nTurning ON all components in: " + name);

        for (SmartComponent component : components) {
            component.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println("\nTurning OFF all components in: " + name);

        for (SmartComponent component : components) {
            component.turnOff();
        }
    }

    @Override
    public void showStatus() {
        System.out.println("\n[" + name + " Status]");

        for (SmartComponent component : components) {
            component.showStatus();
        }
    }

    @Override
    public double getPowerConsumption() {
        double totalPower = 0;

        for (SmartComponent component : components) {
            totalPower += component.getPowerConsumption();
        }

        return totalPower;
    }
}
