public class SimpleHouseBuilder implements HouseBuilder{
    private String color;
    private String rooms;
    private String door;
    private String windows;
    private String furniture;
    private String garden;
    @Override
    public HouseBuilder setColor(String color){
        this.color=color;
        return this;
    }
    @Override
    public HouseBuilder setRooms(String rooms){
        this.rooms=rooms;
        return this;
    }
    @Override
    public HouseBuilder setDoor(String door){
        this.door=door;
        return this;
    }

    @Override
    public HouseBuilder setWindows(String windows){
        this.windows=windows;
        return this;
    }
    @Override
    public HouseBuilder setFurniture(String furniture){
        this.furniture=furniture;
        return this;
    }
    @Override
    public HouseBuilder setGarden(String garden){
        this.garden=garden;
        return this;
    }
    @Override
    public SpongeBobHouse build(){
        validate();
        return new SpongeBobHouse(
                color,
                rooms,
                door,
                windows,
                furniture,
                garden
        );
    }

    private void validate(){
        if(color==null || color.isBlank()){
            throw new IllegalStateException("House color is required.");
        }
        if(rooms==null || rooms.isBlank()){
            throw new IllegalStateException("House rooms are required.");
        }
        if(door==null || door.isBlank()){
            throw new IllegalStateException("House door is required.");
        }
    }
}
