package onlineStore

def barang1 = new Electronic("Laptop", 10000000, 8, 4)
def barang2 = new Clothing("Kaos", 50000, 20, "XL")

def store = new Store()
store.tambahProduk("001", barang1)
store.tambahProduk("002", barang2)
store.tampilkanProduk()
store.beliProduk("001", 5)