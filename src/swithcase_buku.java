import java.util.Scanner;

public class swithcase_buku {
	public static void main (String[] args) {
		int buku;
		System.out.println(" No.| Mata Pelajaran");
		System.out.println("--------------------------------");
		System.out.println(" 01. | Bahasa Indonesia");
		System.out.println(" 02. | Bahasa Inggris");
		System.out.println(" 03. | Ilmu Pengetahuan Alam");
		System.out.println(" 04. | Ilmu Pengetahuan Sosial");
		System.out.println(" 05. | Seni Budaya");
		System.out.println("--------------------------------");
		System.out.println("");
		System.out.println("[CARI BUKU]");
		System.out.println("Untuk Menemukan Buku, Silahkan Input Nomer Buku Sesuai List Diatas : ");
		
		Scanner masukkan = new Scanner (System.in);
		buku=masukkan.nextInt();
		
		switch (buku) {
		case 01:
			System.out.println("Buku Bahasa Indonesia Tersedia");
			break;
		case 02:
			System.out.println("Buku Bahasa Inggris Tersedia");
			break;
		case 03:
			System.out.println("Buku Ilmu Pengetahuan Alam Tersedia");
			break;
		case 04:
			System.out.println("Buku Ilmu Pengetahuan Sosial Tersedia");
			break;
		case 05:
			System.out.println("Buku Seni Budaya Tersedia");
			break;
		default:
			System.out.println("Buku Dengan Nomer Tersebut Tidak Tersedia");
			break;
		}
	}
}
