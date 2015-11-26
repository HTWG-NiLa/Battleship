# Battleship

## Installation

### Eclipse
1. Make sure you have Gradle installed (https://docs.gradle.org/current/userguide/installation.html)
2. Checkout this repository to the desired directory
3. Open the command line, switch to the repo directory and use "gradle eclipse" to build necessary files for eclipse
4. Open Eclipse and go to *File* -> *Import...* -> *Existing Projects to Workspace*

## Model Layer:

### Interface Ship
- Field[] getFields();
- boolean isDistroyed();
- void createShip(Polygon ship, ...);
- Polygon getKind();

### Interface Field
- boolean isShip();
- boolean bomb();
- Point getCoordinates();

### Interface Player
- String getName();
- setName(String name);
- Ship[] getShips();

### Interface Polygon
- to be continued
