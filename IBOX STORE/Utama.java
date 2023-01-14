import java.util.Scanner;

public class Utama {
  private static int pilihanMenu;
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Loop utama program
    do {
        // Tampilkan menu utama
        System.out.println("Menu utama:");
        System.out.println("1. Data barang");
        System.out.println("2. Transaksi");
        System.out.println("3. Laporan transaksi");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
        int pilihanMenu = input.nextInt();
  
        switch (pilihanMenu) {
            case 1:
            DataBarang.menu();
            break;
            case 2:
            Transaksi.menu();
            break;
            case 3:
            LaporanTransaksi.menu();
            break;
            case 4:
            break;
            default:
            System.out.println("Pilihan menu tidak valid.");
            break;
        }
        }while (pilihanMenu !=4);
    }
    @Override
    public String toString() {
        return "MenuUtama []";
    }
  }
