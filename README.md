# Battleship

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
