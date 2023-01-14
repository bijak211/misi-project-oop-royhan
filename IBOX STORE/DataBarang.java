import java.util.Scanner;

public class DataBarang {
    static Scanner input = new Scanner(System.in);

    public static void menu(){
        int pilihanDataBarang;

        do {
        // Tampilkan menu data barang
        System.out.println("MENU IBOX STORE:");
        System.out.println("1. Input barang");
        System.out.println("2. Update barang");
        System.out.println("3. Hapus barang");
        System.out.println("4. Kembali ke menu utama");
        System.out.print("Pilih menu: ");
        pilihanDataBarang = input.nextInt();

        switch (pilihanDataBarang){
            case 1:
                InputBarang.masuk();
                break;
            case 2:
                InputBarang.update();
                break;
            case 3:
                InputBarang.hapus();
                break;
            case 4:
              // Kembali ke menu utama
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
            }
        }while (pilihanDataBarang != 4);
    }
}

       