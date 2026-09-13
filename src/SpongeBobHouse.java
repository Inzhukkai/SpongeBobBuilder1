public class SpongeBobHouse {
    private final String color;
    private final String rooms;
    private final String door;
    private final String windows;
    private final String furniture;
    private final String garden;
    public SpongeBobHouse(
            String color,
            String rooms,
            String door,
            String windows,
            String furniture,
            String garden
    ){
    this.color=color;
    this.rooms=rooms;
    this.door=door;
    this.windows=windows;
    this.furniture=furniture;
    this.garden=garden;
    }
    @Override
    public String toString(){
    return "SpongeBobHouse{"+
            "color='"+color+'\''+
            ",rooms='"+rooms+'\''+
            ",door='"+door+'\''+
            ",windows='"+windows+'\''+
            ",furniture='"+furniture+'\''+
            ",garden='"+garden+'\''+
            '}';
    }
}