# Smart Home Control System Using Composite Design Pattern

## 1. Project Overview

The **Smart Home Control System** is a Java-based application that demonstrates the use of the **Composite Design Pattern** in a practical and organized way.

The system models a smart home as a hierarchical structure:

- A **Smart Home** contains floors.
- Each **Floor** contains rooms or specialized areas.
- Each **Room/Area** contains smart devices.

The program allows the same operations to be applied to:

- A single smart device
- A room containing several devices
- A floor containing multiple rooms
- The entire smart home

This behavior clearly demonstrates the main idea of the Composite Design Pattern:  
**treating individual objects and groups of objects uniformly.**

---

## 2. Design Pattern Used

### Composite Design Pattern

The Composite Pattern is used because the smart home naturally follows a **part-whole hierarchy**.

In this project:

| Composite Pattern Role | Project Class |
|---|---|
| Component | `SmartComponent` |
| Leaf | `SmartDevice` |
| Composite | `SmartGroup` |
| Client | `Main` |

---

## 3. Class Responsibilities

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
Represents a single smart device such as:
- Light
- Smart TV
- Air Conditioner
- Heater
- Security Camera
- Smart Door Lock

Each device stores:
- Device name
- Power consumption
- Current status (`ON` / `OFF`)

---

### `SmartGroup`
Represents a group of smart components such as:
- Smart Home
- Floor
- Room
- Security Area

A `SmartGroup` can contain:
- `SmartDevice` objects
- Other `SmartGroup` objects

This makes it possible to create nested structures recursively.

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

## 4. Smart Home Structure

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
```

---

## 5. Main Features

The system supports the following operations:

### Turn Components On
```java
smartHome.turnOn();
```
Turns on all devices in the entire smart home.

### Turn Components Off
```java
secondFloor.turnOff();
```
Turns off all devices located in the second floor only.

### Show Device Status
```java
smartHome.showStatus();
```
Displays the current status of every device in the smart home.

### Calculate Current Power Consumption
```java
smartHome.getPowerConsumption();
```
Calculates the total power usage of all devices that are currently turned on.

---

## 6. Example Program Flow

The program performs the following sequence:

1. Displays the initial status of all devices.  
   All devices begin in the `OFF` state.

2. Turns on the entire smart home:
   ```java
   smartHome.turnOn();
   ```

3. Displays the updated status.  
   All devices become `ON`.

4. Calculates total current power consumption:
   ```text
   3290.0 Watts
   ```

5. Turns off only the second floor:
   ```java
   secondFloor.turnOff();
   ```

6. Displays the updated status again.

7. Recalculates power consumption:
   ```text
   2547.0 Watts
   ```

---

## 7. Project Files

```text
SmartComponent.java
SmartDevice.java
SmartGroup.java
Main.java
```

---

## 8. How to Run the Project in NetBeans

1. Open the project in **NetBeans**.
2. Make sure all Java classes are inside the same package:
   ```java
   package main;
   ```
3. Right-click the project.
4. Select:
   ```text
   Run
   ```
5. The output will appear in the **Output Console**.

---

## 9. Why This Design Is Maintainable

This solution is clear and maintainable because:

- All smart components follow one common structure.
- New smart devices can be added easily without changing the existing hierarchy.
- New rooms, floors, or areas can be created using the same `SmartGroup` class.
- Recursive behavior reduces repeated code and makes the system scalable.
- The design strongly demonstrates the Composite Pattern in a realistic application.

---

## 10. Conclusion

The **Smart Home Control System** provides a clear and effective implementation of the **Composite Design Pattern**. It allows both individual smart devices and groups of devices to be handled through the same interface, while supporting recursive control, status display, and power consumption calculation across a complete smart home hierarchy.
