package composition.latihan;

public class Kitchen extends Room {

    public Kitchen() {
        super("Dapur");
    }

    public void cook(){
        System.out.println("Memasak di dapur.");
    }
}
