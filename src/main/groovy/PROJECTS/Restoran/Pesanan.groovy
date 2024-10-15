package PROJECTS.Restoran

class Pesanan {
    String namaPelanggan
    int nomorMeja
    ArrayList<String> listMenu

    Pesanan(String namaPelanggan, int nomorMeja){
        this.namaPelanggan = namaPelanggan
        this.nomorMeja = nomorMeja
        this.listMenu = new ArrayList<>()
    }

    void tambahMenu(String menu) {
        listMenu.add(menu)
        println("${menu} berhasil ditambahkan")
        println()
    }

    void hapusMenu(String menu) {
        listMenu.remove(menu)
        println("${menu} berhasil dihapus")
        println()
    }

    void tampilkanPesanan() {
        println("Pelanggan: ${namaPelanggan}")
        println("Nomor Meja: ${nomorMeja}")
        println("Menu yang dipesan: ")
        for (int i; i < listMenu.size(); i++){
            println("- ${listMenu[i]}")
        }
        println()
    }
}
