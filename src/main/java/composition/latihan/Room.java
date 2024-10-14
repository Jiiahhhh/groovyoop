package composition.latihan;

public class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public void describeRoom(){
        System.out.println("Ini adalah ruang " + name);
    }
}
