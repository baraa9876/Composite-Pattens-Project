/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author baraa
 */
public abstract class SmartComponent {
    public abstract String getName();

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void showStatus();

    public abstract double getPowerConsumption();

    public void add(SmartComponent component) {
        throw new UnsupportedOperationException("This component cannot contain sub-components.");
    }

    public void remove(SmartComponent component) {
        throw new UnsupportedOperationException("This component cannot remove sub-components.");
    }
}
