package encapsulation.latihan;

public class Mobil {
    private int kecepatan;

    public Mobil(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan(int nilai){
        if (kecepatan <= 0) {
            System.out.println("Nah mogok mobil ta' ini eee");
        } else {
            kecepatan += nilai;
            System.out.println("Mobil naik ke kecepatan: " + kecepatan);
        }
    }

    public void kurangiKecepatan(int nilai){
        if (kecepatan <= 0) {
            System.out.println("Berhenti ki' itu eee");
        } else {
            kecepatan -= nilai;
            System.out.println("Mobil turun kecepatan: " + kecepatan);
        }
    }
}
