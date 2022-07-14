import java.util.Scanner;

//public abstract class Bangun{
	//abstract void draw();}

public class Bangun2D{
	int id, p, t, l, k;
	public Bangun2D(int p, int t){
		this.p = p;
		this.t = t;}
public class MainBangun{
	public static int TampilMenu(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Simulasi Bangun\n1. Buat objek bangun\n2. Ubah atribut\n3. Deskripsi sebuah objek\n4. Deskripsi semua objek\n5. Keluar program");
		int a = inp.nextInt();
		return a;
	}l
	public static void main (String args[]){
		int pilih;
		for(;;){
			pilih = TampilMenu();
			if (pilih == 1){
				System.out.println("Buat objek apa?\n(0-Segitiga atau 1-Segiempat)")
				int b = inp.nextInt();}
				for (;;){
					if (b == 0){
						//jalankan method buat objek segitiga
						break;}
					else if (b == 1){
						//jalankan method buat objek segiempat
						break;}
					else{
						System.out.println("Masukkan 0 untuk objek Segitiga atau 1 untuk objek Segiempat");}
			else if (pilih == 2){
				System.out.println("Objek ID?");
				int c = inp.nextInt();
				for (;;){
					if (b == 0){
						//jalankan method ubah atribut segitiga
						break;
					else if (b == 1){
						//jalankan method ubah atribut segiempat
						break;
					else{
						System.out.println("Masukkan 0 untuk objek Segitiga atau 1 untuk objek Segiempat");
				else if (pilih == 3){
					System.out.println("Objek ID?");
					int d = inp.nextInt();
					for (;;){
						if (b == 0){
						//jalankan method deskripsi segitiga
						break;
					else if (b == 1){
						//jalankan method deskripsi segiempat
						break;
					else{
						System.out.println("Masukkan 0 untuk objek Segitiga atau 1 untuk objek Segiempat");
				else if (pilih == 4){
					//tampilkan deskripsi semua objek
				else if (pilih == 5){
					break;
				else{
					System.out.println("Masukkan angka 1-5");
	}
}