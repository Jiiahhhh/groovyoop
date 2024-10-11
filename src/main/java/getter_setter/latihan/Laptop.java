package getter_setter.latihan;

public class Laptop {
    private String merek;
    private double harga;

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Na mukasih gratis itu eee");
            this.harga = 0;
        }
    }
}
