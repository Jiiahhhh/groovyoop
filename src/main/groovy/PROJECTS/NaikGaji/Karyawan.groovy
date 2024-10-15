package PROJECTS.NaikGaji

class Karyawan {
    String nama
    String id
    double gaji
    int lamaKerja

    Karyawan(String nama, String id, double gaji, int lamaKerja){
        this.nama = nama
        this.id = id
        this.gaji = gaji
        this.lamaKerja = lamaKerja
    }

    void tampilkanInfo(){
        println("Nama: ${nama}")
        println("ID: ${id}")
        println("Gaji: Rp${gaji}")
        println("Lama kerja: ${lamaKerja} tahun")
        println("Gaji setelah kenaikan: Rp${naikkanGaji()}")
    }

    double naikkanGaji(){
        if(lamaKerja < 10) {
            gaji = gaji + (gaji * 0.2)
        } else if (lamaKerja < 5) {
            gaji = gaji + (gaji * 0.1)
        }
        return gaji
    }
}
