package getter_setter.latihan;

public class cekLaptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();
        laptop1.setMerek("Asus");
        laptop1.setHarga(12000000);

        System.out.println("Merek Laptop: " + laptop1.getMerek());
        System.out.println("Harga Laptop: " + laptop1.getHarga());

        laptop2.setMerek("Dell");
        laptop2.setHarga(-5000000);
    }
}
