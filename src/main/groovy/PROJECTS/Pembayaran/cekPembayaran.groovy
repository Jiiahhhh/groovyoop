package PROJECTS.Pembayaran

def kartuKredit = new KartuKredit("123456", 10000000)
def transferBank = new TransferBank("654321", 10000000)

kartuKredit.bayar(10000000)
kartuKredit.bayar(1000000)
transferBank.bayar(10000000)
transferBank.bayar(1000000)