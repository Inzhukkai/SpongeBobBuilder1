SpongeBob Builder Pattern

 1. Project Description

This project demonstrates the Builder Design Pattern in Java.

The chosen topic is building houses of SpongeBob SquarePants characters.

A house can have different characteristics:

- color;
- rooms;
- door;
- windows;
- furniture;
- garden.

The Builder Pattern allows us to create a house step by step and create different versions of the same product.



2. Builder Pattern Structure

The project contains the following Builder Pattern components:

Product

`SpongeBobHouse`

This class represents the final product — a completed house.

It contains the characteristics of the house:

- color;
- rooms;
- door;
- windows;
- furniture;
- garden.

Builder

`HouseBuilder`

This interface defines the methods required to build a house.

It contains setter methods and the `build()` method.

The setter methods return the Builder itself, which allows method chaining.

Example:

java
builder
        .setColor("Yellow")
        .setRooms("Two rooms")
        .setDoor("Round")
        .build();

Concrete Builder

SimpleHouseBuilder

This class implements HouseBuilder.

It stores the house characteristics and creates the final SpongeBobHouse object using the build() method.

It also validates required properties before creating the house.

Director

SpongeBobHouseDirector

The Director contains predefined construction recipes.

For example:

SpongeBob's house;
Patrick's house.

The Director controls the order in which the Builder methods are called.

Client

Main

The Main class is the Client.

It creates the Builder and Director and starts the construction of the houses.

It also demonstrates how to create a custom house directly with the Builder.

3. Why Builder Pattern?

The Builder Pattern is suitable for this project because a house consists of several characteristics that can be configured independently.

Instead of using a constructor with many parameters, the Builder allows us to create the house step by step.

The same construction process can produce different houses.

For example:

SpongeBob's house is yellow;
Patrick's house is pink;
a custom house can be blue.

This makes the construction process easier to read and understand.
