# Factory Method & Abstract Factory

## Project Overview

This project demonstrates the implementation of two creational design patterns in Java:

* **Factory Method**
* **Abstract Factory**

The project was developed as part of the **Software Design Patterns** course.

## Technologies

* Java 17
* IntelliJ IDEA
* Git / GitHub

## Implemented Patterns

### Factory Method

The Factory Method pattern is demonstrated using a transport system.

The project contains:

* `Transport` — common product interface
* `Truck` and `Ship` — concrete products
* `TransportFactory` — abstract creator
* `TruckFactory` and `ShipFactory` — concrete creators

Each concrete factory creates a specific type of transport.

### Abstract Factory

The Abstract Factory pattern is demonstrated using platform-specific GUI components.

The project contains:

* `Button` — abstract product
* `Checkbox` — abstract product
* `WindowsButton` and `WindowsCheckbox` — Windows products
* `MacButton` and `MacCheckbox` — macOS products
* `GUIFactory` — abstract factory
* `WindowsFactory` and `MacFactory` — concrete factories
* `Application` — client

Each concrete factory creates a complete family of related GUI components.

## Project Structure

```text
src/
└── main/
    └── java/
        └── com.example.factorypatterns/
            ├── factorymethod/
            │   ├── Transport.java
            │   ├── Truck.java
            │   ├── Ship.java
            │   ├── TransportFactory.java
            │   ├── TruckFactory.java
            │   └── ShipFactory.java
            │
            ├── abstractfactory/
            │   ├── Button.java
            │   ├── Checkbox.java
            │   ├── GUIFactory.java
            │   ├── WindowsButton.java
            │   ├── WindowsCheckbox.java
            │   ├── WindowsFactory.java
            │   ├── MacButton.java
            │   ├── MacCheckbox.java
            │   └── MacFactory.java
            │
            ├── client/
            │   └── Application.java
            │
            └── Main.java
```

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure Java 17 is configured.
4. Run the `Main` class.

The program demonstrates both patterns in the console.

### Expected Output

```text
=== FACTORY METHOD ===
Delivering cargo by truck.
Delivering cargo by ship.

=== ABSTRACT FACTORY: WINDOWS ===
Rendering Windows button.
Rendering Windows checkbox.

=== ABSTRACT FACTORY: macOS ===
Rendering macOS button.
Rendering macOS checkbox.
```

## Design Goals

The implementation demonstrates:

* Separation of object creation from object usage
* Programming to interfaces
* Reduced coupling
* Consistent families of related objects
* Extensibility without modifying the client code
* Clean Code principles
