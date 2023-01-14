import java.util.Scanner;
public class Transaksi {
    static Scanner input = new Scanner(System.in);

      // Array untuk menyimpan transaksi pembelian
      static String[] namaPembeli = new String[100];
      static String[] namaBarangBeli = new String[100];
      static int[] jumlahBarangBeli = new int[100];
      static int[] totalHarga = new int[100];

    public static void menu(){

    

        // Tampilkan menu transaksi
        System.out.println("Menu transaksi:");
        System.out.println(
                "______________________________________________________________________________");
        System.out.println(
                "|      SELAMAT DATANG DI IBOX STORE BERIKUT ADALAH BARANG YANG TERSEDIA      |");
        System.out.println(
                "______________________________________________________________________________");

        System.out.println(
                "______________________________________________________________________________");
        System.out.println(
                "| NO |     Nama Barang     |          Harga          |          Stok         |");
        System.out.println(
                "==============================================================================");
        for (int i = 0; i < InputBarang.jumlahBarang; i++) {
        System.out.printf("|%-4s|%-21s|Rp. %-21s|%-23s| %n", i + 1, InputBarang.namaBarang[i], InputBarang.hargaBarang[i], InputBarang.stokBarang[i]);
        }
        System.out.println(
            "______________________________________________________________________________");
        System.out.print("Pilih barang: ");
        int pilihanBarang = input.nextInt();
        if (pilihanBarang < 1 || pilihanBarang > InputBarang.jumlahBarang) {
        System.out.println("Pilihan barang tidak valid.");
        } else {
        // Proses transaksi pembelian
        System.out.print("Masukkan nama pembeli: ");
        input.nextLine(); // Hapus baris kosong setelah input integer sebelumnya
        namaPembeli[InputBarang.jumlahTransaksi] = input.nextLine();
        namaBarangBeli[InputBarang.jumlahTransaksi] = InputBarang.namaBarang[pilihanBarang - 1];

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        jumlahBarangBeli[InputBarang.jumlahTransaksi] = input.nextInt();
        if (jumlahBarangBeli[InputBarang.jumlahTransaksi] > InputBarang.stokBarang[pilihanBarang - 1]) {
       
                System.out.println("Stok tidak mencukupi.");
        } else {
        // Update stok barang dan tambahkan transaksi pembelian ke array
        InputBarang.stokBarang[pilihanBarang - 1] -= jumlahBarangBeli[InputBarang.jumlahTransaksi];
        totalHarga[InputBarang.jumlahTransaksi] = jumlahBarangBeli[InputBarang.jumlahTransaksi] * InputBarang.hargaBarang[pilihanBarang - 1];
        InputBarang.jumlahTransaksi++;
        }
        }
    
    }
    
}
