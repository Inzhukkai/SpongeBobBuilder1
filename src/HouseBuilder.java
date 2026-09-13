public interface HouseBuilder{
    HouseBuilder setColor(String color);
    HouseBuilder setRooms(String rooms);
    HouseBuilder setDoor(String door);
    HouseBuilder setWindows(String windows);
    HouseBuilder setFurniture(String furniture);
    HouseBuilder setGarden(String garden);
    SpongeBobHouse build();
}