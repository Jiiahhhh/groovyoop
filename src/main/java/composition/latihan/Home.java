package composition.latihan;

public class Home {
    private Kitchen kitchen;
    private LivingRoom livingRoom;

    public Home() {
        this.kitchen = new Kitchen();
        this.livingRoom = new LivingRoom();
    }

    public void describeHouse(){
        kitchen.describeRoom();
        livingRoom.describeRoom();
    }

    public void useRooms(){
        kitchen.cook();
        livingRoom.relax();
    }
}
