import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.println("Pilihan menu:");
        System.out.println("1. Nasi Goreng (Rp 15,000)");
        System.out.println("2. Mie Ayam (Rp 10,000)");
        System.out.println("3. Bakso (Rp 13,000)");

        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();

        int hargamenu = 0;
        String namaMenu = "";

        switch (pilihan) {
            case 1:
                hargamenu = 15000;
                namaMenu = "Nasi Goreng";
                break;
            case 2:
                hargamenu = 10000;
                namaMenu = "Mie Ayam";
                break;
            case 3:
                hargamenu = 13000;
                namaMenu = "Bakso";
                break;
            default:
                System.out.println("Milih Yang Bener Jir!:(");
                System.exit(0);
        }

        int totalHarga = jumlahPesanan * hargamenu;

        System.out.println("==========================");
        System.out.println("Nama : " + nama);
        System.out.println("Menu : " + namaMenu);
        System.out.println("Jumlah Pesanan : " + jumlahPesanan);
        System.out.println("Harga per Item : Rp " + hargamenu);
        System.out.println("Total Harga : Rp " + totalHarga);
        System.out.println("Arigatou");
    }
}
