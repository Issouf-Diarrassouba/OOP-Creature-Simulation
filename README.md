# OOP Creature-City Simulation

## Overview

This project is a simulation built with object-oriented programming principles such as encapsulation, inheritance, and polymorphism. The system models a city populated by creatures including mice, cats, and zombie cats, each with unique behaviors and interactions within a grid-based layout.

## Class Breakdown

### Creature

The base class `Creature` serves as the foundation for all creatures in the simulation, including `Mouse` and `Cat`. `ZombieCat` extends `Cat`, demonstrating inheritance, as it modifies cat behavior to adapt to its environment. Creatures are dependent on the `City` class for positioning and visibility, emphasizing encapsulation of their environment.

### Gridpoint

The `Gridpoint` class represents locations within the city grid. It manages the coordinates where creatures can spawn and move, using randomized logic to simulate dynamic behavior. Gridpoints interact with `Creature` instances to control spatial distribution and movement.

### City

The `City` class ties the entire simulation together. It maintains the overall structure, scene, and creature interactions. `City` is associated with both `Creature` and `Gridpoint`, serving as the central hub that brings the simulation to life.

## Method: `public void simulate()`

The core method driving the simulation is `simulate()`, implemented within the `City` class. It governs the flow of events, ensuring creatures move and interact across the grid. While primarily connected to the `City`, it indirectly relies on `Creature` and `Gridpoint` to provide context and functionality for simulation events.

## Possible Expansion

A proposed addition is the introduction of a `ZombieMouse` class—an aggressive variant that hunts mice but poisons cats. This would add an extra layer of hierarchy and complexity to the simulation, offering opportunities to further explore polymorphism and behavior-driven inheritance.

## Key OOP Principles Demonstrated

- **Encapsulation**: Each class controls its own data and behavior.
- **Inheritance**: ZombieCat extends Cat, which extends Creature.
- **Polymorphism**: Future additions like ZombieMouse can override or extend behaviors for more dynamic simulation logic.

---
