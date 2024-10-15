package PROJECTS.onlineStore

class Product {
    String nama
    double harga
    int stok

    Product (String nama, double harga, int stok){
        this.nama = nama
        this.harga = harga
        this.stok = stok
    }

    String tampilkanDetail(){
        return "Nama : ${nama}, Harga: ${harga}, Stok ${stok} "
    }
}
