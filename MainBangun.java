import java.util.Scanner;

abstract class Bangun2D{
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
}
class Segitiga extends Bangun2D{
	public Segitiga(int id_bangun, int p_bangun, int t_bangun){
		super(id_bangun, p_bangun, t_bangun);
	}
	public int hitungLuas(){
		return (p * t) / 2;
	}
	public void deskripsi(){
		System.out.println("Segiempat\n[ID = 2;  Panjang =" + p + "Tinggi =" + t + "Luas =" + l + "]");
	}
}
class Segiempat extends Bangun2D{
	public Segiempat(int id_bangun, int p_bangun, int t_bangun){
		super(id_bangun, p_bangun, t_bangun);
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
		int countId = 1;
		Bangun2D[] arrBangun = new Bangun2D[100];
		for(;;){
			pilih = TampilMenu();
			if (pilih == 1){
				System.out.println("Buat objek apa?\n(0-Segitiga atau 1-Segiempat)");
				int menu1 = inp.nextInt();
				for (;;){
					if (menu1 == 0){
						System.out.println("Nomor ID: " + countId);
						System.out.println("Alas? ");
						int alas = inp.nextInt();
						System.out.println("Tinggi? ");
						int tinggi = inp.nextInt();
						arrBangun[countId] = new Segitiga(countId, alas, tinggi);
						countId++;
						break;
					}
					else if (menu1 == 1){
						System.out.println("Nomor ID: " + countId);
						System.out.println("Panjang? ");
						int panjang = inp.nextInt();
						System.out.println("Lebar? ");
						int lebar = inp.nextInt();
						arrBangun[countId] = new Segiempat(countId, panjang, lebar);
						countId++;
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
