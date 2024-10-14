package composition.belajar;

public class Engine {
    private String type;

    public Engine(String type){
        this.type = type;
    }

    public void start() {
        System.out.println("Mesin tipe " + type + " dihidupkan.");
    }
}
