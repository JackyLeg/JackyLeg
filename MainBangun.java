import java.util.Scanner;

import Segitiga.BuatBangun0;

public abstract class Bangun2D{
	int id, p, t, l;
	public Bangun2D(int id_bangun, int p_bangun, int t_bangun){
		id_bangun = id;
		p_bangun = p;
		t_bangun = t;
	}
	public Bangun2D(){
	}

	abstract int hitungLuas();
	
	abstract void deskripsi();
	
	public int getPanjang(){
		return p;
	}
	public int getTinggi(){
		return t;
	}
	public void setPanjang(int pNew){
		p = pNew;
	}
	public void setTinggi(int tNew){
		t = tNew;
	}
	abstract void buatObjek();
	/*{
		Scanner inp = new Scanner(System.in);
		//int p_bangun, t_bangun;
		System.out.println("Objek ID = 0");
		System.out.print("Panjang? ");
		int inputPanjang = inp.nextInt();
		System.out.print("Tinggi? ");
		int inputTinggi = inp.nextInt();
		int p_bangun = inputPanjang;
		int t_bangun = inputTinggi;
		Bangun2D bangun = new Bangun2D(0, p_bangun, t_bangun);
		System.out.println("Objek berhasil dibuat");
	}*/
}
public class Segitiga extends Bangun2D{
	public Segitiga(int id_bangun, int p_bangun, int t_bangun){
		super(id_bangun, p_bangun, t_bangun);
	}
	public Segitiga(){
	}

	//@Override
	public void buatObjek(){
		Scanner inp = new Scanner(System.in);
		//int p_bangun, t_bangun;
		System.out.println("Objek ID = 1");
		System.out.print("Panjang? ");
		int inputPanjang = inp.nextInt();
		System.out.print("Tinggi? ");
		int inputTinggi = inp.nextInt();
		int p_bangun = inputPanjang;
		int t_bangun = inputTinggi;
		Segitiga bangunSegitiga = new Segitiga(1, p_bangun, t_bangun);
		System.out.print("Objek segitiga berhasil dibuat");
	}
	public void ubahAtribut(){
		Scanner inp = new Scanner(System.in);
		System.out.print("Objek ID? ");
		int tanyaId = inp.nextInt();
		
	}
	public int hitungLuas(){
		return (p * t) / 2;
	}
	public void deskripsi(){
		System.out.println("Segitiga\n[ID = 1;  Panjang =" + p + "Tinggi =" + t + "Luas =" + l + "]");
	}
}
public class Segiempat extends Bangun2D{
	public Segiempat(int id_bangun, int p_bangun, int t_bangun){
		super(id_bangun, p_bangun, t_bangun);
	}
	public Segiempat(){
	}
	//@Override
	public void buatObjek(){
		Scanner inp = new Scanner(System.in);
		//int p_bangun, t_bangun;
		System.out.println("Objek ID = 2");
		System.out.print("Panjang? ");
		int inputPanjang = inp.nextInt();
		System.out.print("Tinggi? ");
		int inputTinggi = inp.nextInt();
		int p_bangun = inputPanjang;
		int t_bangun = inputTinggi;
		System.out.print("Objek segiempat berhasil dibuat");
	}
	public void ubahAtribut(){
		Scanner inp = new Scanner(System.in);
		System.out.print("Objek ID? ");
		int tanyaId = inp.nextInt();
	}
	public int hitungLuas(){
		return p * t;
	}
	public void deskripsi(){
		System.out.println("Segiempat\n[ID = 2;  Panjang =" + p + "Tinggi =" + t + "Luas =" + l + "]");
	}
}
public class MainBangun{
	public static int TampilMenu(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Simulasi Bangun\n1. Buat objek bangun\n2. Ubah atribut\n3. Deskripsi sebuah objek\n4. Deskripsi semua objek\n5. Keluar program");
		int menuHome = inp.nextInt();
		return menuHome;
	}
	public static void main (String args[]){
		Scanner inp = new Scanner(System.in);
		int pilih;
		for(;;){
			pilih = TampilMenu();
			if (pilih == 1){
				System.out.println("Buat objek apa?\n(0-Segitiga atau 1-Segiempat)");
				int menu1 = inp.nextInt();
				for (;;){
					if (menu1 == 0){
						Segitiga buat0 = new Segitiga();
						buat0.buatObjek();
						break;
					}
					else if (menu1 == 1){
						Segiempat buat1 = new Segiempat();
						buat1.buatObjek();
						break;
					}
					else{
						System.out.println("Masukkan 0 untuk objek Segitiga atau 1 untuk objek Segiempat");
					}
				}
			}
			else if (pilih == 2){
				System.out.println("Objek ID?");
				int menu2 = inp.nextInt();
				for (;;){
					if (menu2 == 0){
						//jalankan method ubah atribut segitiga
						break;
					}
					else if (menu2 == 1){
						//jalankan method ubah atribut segiempat
						break;
					}
					else{
						System.out.println("Masukkan 0 untuk objek Segitiga atau 1 untuk objek Segiempat");
					}
				}
			}
			else if (pilih == 3){
					System.out.println("Objek ID?");
					int menu3 = inp.nextInt();
					for (;;){
						if (menu3 == 0){
							//jalankan method deskripsi segitiga
							break;
						}
						else if (menu3 == 1){
							//jalankan method deskripsi segiempat
							break;
						}
					else{
						System.out.println("Masukkan 0 untuk objek Segitiga atau 1 untuk objek Segiempat");
					}
				}
			}
			else if (pilih == 4){
					//tampilkan deskripsi semua objek
				}
			else if (pilih == 5){
					break;
				}
			else{
				System.out.println("Masukkan angka 1-5");
				}//else
		}//for
	}//main method
}//MainBangun class		
