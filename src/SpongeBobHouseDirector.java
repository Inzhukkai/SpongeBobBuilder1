public class SpongeBobHouseDirector{
    private final HouseBuilder builder;
    public SpongeBobHouseDirector(HouseBuilder builder){
        this.builder=builder;
    }
    public SpongeBobHouse makeSpongeBobHouse(){
        return builder
                .setColor("Yellow")
                .setRooms("Living room and bedroom")
                .setDoor("Round")
                .setWindows("Two round windows")
                .setFurniture("Bed and table")
                .setGarden("Small garden")
                .build();
    }
    public SpongeBobHouse makePatrickHouse(){
        return builder
                .setColor("Pink")
                .setRooms("One room")
                .setDoor("Simple")
                .setWindows("One small window")
                .setFurniture("Bed")
                .setGarden("No garden")
                .build();
    }
}
