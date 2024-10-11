package encapsulation.latihan;

public class cekMobil {
    public static void main(String[] args) {
        Mobil mobil = new Mobil(10);
        mobil.tambahKecepatan(20);
        mobil.kurangiKecepatan(30);
        mobil.kurangiKecepatan(100);
        mobil.tambahKecepatan(20);
    }
}
