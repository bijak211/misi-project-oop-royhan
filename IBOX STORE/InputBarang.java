import java.util.Scanner;

public class InputBarang {
    static Scanner input = new Scanner(System.in);

    // Array untuk menyimpan barang-barang yang tersedia
    static String[] namaBarang = new String[100];
    static int[] stokBarang = new int[100];
    static int[] hargaBarang = new int[100];

    static int jumlahBarang = 0; // Menyimpan jumlah barang yang tersedia
    static int jumlahTransaksi = 0; // Menyimpan jumlah transaksi yang terjadi


    public static void masuk() {

        // Tampilkan menu data barang
        System.out.println("Menu data barang:");
        System.out.println("1. Input barang");
        System.out.println("2. Update barang");
        System.out.println("3. Hapus barang");
        System.out.print("Pilih menu: ");
        int pilihanDataBarang = input.nextInt();

        if (pilihanDataBarang == 1) {
          // Input barang baru
          System.out.print("Masukkan nama barang: ");
          input.nextLine(); // Hapus baris kosong setelah input integer sebelumnya
          namaBarang[jumlahBarang] = input.nextLine();
          System.out.print("Masukkan stok barang: ");
          stokBarang[jumlahBarang] = input.nextInt();
          System.out.print("Masukkan harga barang: ");
          hargaBarang[jumlahBarang] = input.nextInt();
          jumlahBarang++;
        } else if (pilihanDataBarang == 2) {
          // Update barang yang sudah ada
          System.out.print("Masukkan nama barang yang ingin diupdate: ");
          input.nextLine(); // Hapus baris kosong setelah input integer sebelumnya
          String namaBarangUpdate = input.nextLine();
          boolean barangDitemukan = false;
          for (int i = 0; i < jumlahBarang; i++) {
          if (namaBarang[i].equals(namaBarangUpdate)) {
          System.out.print("Masukkan stok barang baru: ");
          stokBarang[i] = input.nextInt();
          System.out.print("Masukkan harga barang baru: ");
          hargaBarang[i] = input.nextInt();
          barangDitemukan = true;
          break; 
          }
          }
          if (!barangDitemukan) {
          System.out.println("Barang tidak ditemukan.");
          }
          } else if (pilihanDataBarang == 3) {
          // Hapus barang
          System.out.print("Masukkan nama barang yang ingin dihapus: ");
          input.nextLine(); // Hapus baris kosong setelah input integer sebelumnya
          String namaBarangHapus = input.nextLine();
          boolean barangDitemukan = false;
          for (int i = 0; i < jumlahBarang; i++) {
          if (namaBarang[i].equals(namaBarangHapus)) {
          // Hapus barang dengan menggeser barang-barang setelahnya ke kiri
          for (int j = i; j < jumlahBarang - 1; j++) {
          namaBarang[j] = namaBarang[j + 1];
          stokBarang[j] = stokBarang[j + 1];
          hargaBarang[j] = hargaBarang[j + 1];
          }
          jumlahBarang--;
          barangDitemukan = true;
          break;
          }
          }
          if (!barangDitemukan) {
          System.out.println("Barang tidak ditemukan.");
          }
        }
    }
    
    public static void update() {


      // Update barang yang sudah ada
      System.out.print("Masukkan nama barang yang ingin diupdate: ");
      input.nextLine(); // Hapus baris kosong setelah input integer sebelumnya
      String namaBarangUpdate = input.nextLine();
      boolean barangDitemukan = false;
      for (int i = 0; i < jumlahBarang; i++) {
      if (namaBarang[i].equals(namaBarangUpdate)) {
      System.out.print("Masukkan stok barang baru: ");
      stokBarang[i] = input.nextInt();
      System.out.print("Masukkan harga barang baru: ");
      hargaBarang[i] = input.nextInt();
      barangDitemukan = true;
      break;
      }
      }
      if (!barangDitemukan) {
      System.out.println("Barang tidak ditemukan.");
      }
    }

    public static void hapus() {
      

       // Hapus barang
       System.out.print("Masukkan nama barang yang ingin dihapus: ");
       input.nextLine(); // Hapus baris kosong setelah input integer sebelumnya
       String namaBarangHapus = input.nextLine();
       boolean barangDitemukan = false;
       for (int i = 0; i < jumlahBarang; i++) {
       if (namaBarang[i].equals(namaBarangHapus)) {
       // Hapus barang dengan menggeser barang-barang setelahnya ke kiri
       for (int j = i; j < jumlahBarang - 1; j++) {
       namaBarang[j] = namaBarang[j + 1];
       stokBarang[j] = stokBarang[j + 1];
       hargaBarang[j] = hargaBarang[j + 1];
       }
       jumlahBarang--;
       barangDitemukan = true;
       break;
       }
       }
       if (!barangDitemukan) {
       System.out.println("Barang tidak ditemukan.");
       }
    }
}
