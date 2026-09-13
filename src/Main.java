public class Main{
    public static void main(String[] args){
        HouseBuilder builder=new SimpleHouseBuilder();

        SpongeBobHouseDirector director=
                new SpongeBobHouseDirector(builder);

        SpongeBobHouse spongeBobHouse=
                director.makeSpongeBobHouse();

        System.out.println("SpongeBob's house:");
        System.out.println(spongeBobHouse);
        SpongeBobHouse patrickHouse=
                director.makePatrickHouse();
        System.out.println("\nPatrick's house:");
        System.out.println(patrickHouse);
        SpongeBobHouse customHouse=

                new SimpleHouseBuilder()
                        .setColor("Blue")
                        .setRooms("Two rooms")
                        .setDoor("Square")
                        .setWindows("Three windows")
                        .setFurniture("Sofa and table")
                        .setGarden("Big garden")
                        .build();

        System.out.println("\nCustom house:");
        System.out.println(customHouse);
    }
}