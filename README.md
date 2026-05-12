# Composite-Pattens-Project
# Smart Home Control System Using Composite Design Pattern

## Project Overview

The **Smart Home Control System** is a Java-based application that demonstrates the use of the **Composite Design Pattern**.

The system models a smart home as a hierarchical structure:

- A **Smart Home** contains floors.
- Each **Floor** contains rooms or areas.
- Each **Room/Area** contains smart devices.

The system allows the same operations to be applied to:

- A single smart device
- A room containing multiple devices
- A floor containing multiple rooms
- The entire smart home

This demonstrates the main idea of the Composite Design Pattern:  
**treating individual objects and groups of objects uniformly.**

---

## Design Pattern Used

### Composite Design Pattern

The Composite Pattern is used because the smart home follows a clear **part-whole hierarchy**.

| Composite Pattern Role | Project Class |
|---|---|
| Component | `SmartComponent` |
| Leaf | `SmartDevice` |
| Composite | `SmartGroup` |
| Client | `Main` |

---

## Class Responsibilities

### `SmartComponent`
An abstract class that defines the common operations shared by both individual devices and groups of devices.

Main methods:

- `getName()`
- `turnOn()`
- `turnOff()`
- `showStatus()`
- `getPowerConsumption()`
- `add(SmartComponent component)`
- `remove(SmartComponent component)`

---

### `SmartDevice`
Represents a single smart device, such as:

- Light
- Smart TV
- Air Conditioner
- Heater
- Security Camera
- Smart Door Lock

Each device stores:

- Device name
- Power consumption
- Current status: `ON` or `OFF`

---

### `SmartGroup`
Represents a group of smart components, such as:

- Smart Home
- Floor
- Room
- Security Area

A `SmartGroup` can contain:

- `SmartDevice` objects
- Other `SmartGroup` objects

This allows the system to create a nested hierarchical structure.

---

### `Main`
Acts as the client of the system.

It:

1. Creates the smart home structure.
2. Adds devices to rooms.
3. Adds rooms to floors.
4. Adds floors to the smart home.
5. Demonstrates the main operations of the system.

---

## Smart Home Structure

```text
Smart Home
├── First Floor
│   ├── Living Room
│   │   ├── Living Room Light
│   │   ├── Smart TV
│   │   └── Air Conditioner
│   └── Kitchen
│       ├── Kitchen Light
│       └── Smart Oven
│
└── Second Floor
    ├── Bedroom
    │   ├── Bedroom Light
    │   └── Heater
    └── Security Area
        ├── Security Camera
        └── Smart Door Lock
