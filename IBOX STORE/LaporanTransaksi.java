public class LaporanTransaksi {
    public static void menu() {

        
        // Tampilkan laporan transaksi
        System.out.println(
            "______________________________________________________________________________");
    System.out.println(
            "|                      IBOX STORE LAPORAN TRANSAKSI                          |");
    System.out.println(
            "______________________________________________________________________________");
        for (int i = 0; i < InputBarang.jumlahTransaksi; i++) {
        System.out.printf("%d. %s membeli %s sebanyak %d dengan total harga Rp. %d\n",
        i + 1, Transaksi.namaPembeli[i], Transaksi.namaBarangBeli[i], Transaksi.jumlahBarangBeli[i], Transaksi.totalHarga[i]);
        System.out.println(
            "==============================================================================");
        }
    }
}
