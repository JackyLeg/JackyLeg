import java.util.Scanner;

abstract class Bangun2D{
	int id;
	float p, t, l;
	/*public Bangun2D(int id_bangun, float p_bangun, float t_bangun){
		id_bangun = id;
		p_bangun = p;
		t_bangun = t;
	}*/
	abstract float hitungLuas();
	
	public void deskripsi(){
		System.out.println("Ini adalah sebuah bangun datar");
	}
	public int getId(){
		return id;
	}
	public float getPanjang(){
		return p;
	}
	public float getTinggi(){
		return t;
	}
	public void setPanjang(float pNew){
		p = pNew;
	}
	public void setTinggi(float tNew){
		t = tNew;
	}
}
class Segitiga extends Bangun2D{
	public Segitiga(int id_bangun, float p_bangun, float t_bangun){
		//super(id_bangun, p_bangun, t_bangun);
		//super(id_bangun, p_bangun, t_bangun);
		id = id_bangun;
		p = p_bangun;
		t = t_bangun;
	}
	public float hitungLuas(){
		l = (p * t) / 2;
		return l;
	}
	@Override
	public void deskripsi(){
		System.out.println("[Bangun = Segitiga; ID = " + id + "; Alas = " + p + "cm; Tinggi = " + t + "cm; Luas = " + hitungLuas() + "cm^2]");
	}
}
class Segiempat extends Bangun2D{
	public Segiempat(int id_bangun, float p_bangun, float t_bangun){
		//super(id_bangun, p_bangun, t_bangun);
		id = id_bangun;
		p = p_bangun;
		t = t_bangun;
	}
	public float hitungLuas(){
		l = p * t;
		return l;
	}
	@Override
	public void deskripsi(){
		System.out.println("[Bangun = Segiempat; ID = " + id + "; Panjang = " + p + "cm; Lebar = " + t + "; Luas = " + hitungLuas() + "cm^2]");
	}
}
public class MainBangun{
	public static int TampilMenu(){
		Scanner inp = new Scanner(System.in);
		System.out.println("\nSimulasi Bangun\n1. Buat objek bangun\n2. Ubah atribut\n3. Deskripsi sebuah objek\n4. Deskripsi semua objek\n5. Keluar program");
		int menuHome = inp.nextInt();
		return menuHome;
	}
	public static void displayBangun(Bangun2D[] arrBangun){
		for(int j = 0; j < arrBangun.length ; j++){
			System.out.println("ID = " + arrBangun[j].getId() + "; Panjang = " + arrBangun[j].getPanjang() + "cm; Tinggi = " + arrBangun[j].getTinggi() + "; Luas = " + arrBangun[j].hitungLuas() + "cm^2");
		}
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
						System.out.print("Alas? ");
						float alas = inp.nextFloat();
						System.out.print("Tinggi? ");
						float tinggi = inp.nextFloat();
						arrBangun[countId] = new Segitiga(countId, alas, tinggi);
						System.out.println("Objek Segitiga dengan ID = " + countId + " berhasil dibuat!");
						countId++;
						break;
					}
					else if (menu1 == 1){
						System.out.println("Nomor ID: " + countId);
						System.out.print("Panjang? ");
						float panjang = inp.nextFloat();
						System.out.print("Lebar? ");
						float lebar = inp.nextFloat();
						arrBangun[countId] = new Segiempat(countId, panjang, lebar);
						System.out.println("Objek Segiempat dengan ID = " + countId + "berhasil dibuat!");
						countId++;
						break;
					}
					else{
						System.out.println("Masukkan 0 untuk objek Segitiga atau 1 untuk objek Segiempat");
					}
				}
			}
			else if (pilih == 2){
				System.out.println("Objek ID?\n(0-Segitiga atau 1-Segiempat)");//langsung ke objeknya aja
				int menu2 = inp.nextInt();
				for (;;){//hapus aja perulangan fornya
					if (menu2 == 0){
						System.out.println("Nomor ID?\n(Masukkan angka 1-" + countId + ") ");
						int id = inp.nextInt();
						arrBangun[id].deskripsi();
						System.out.print("Masukkan alas baru: ");
						float al = inp.nextFloat();
						System.out.print("Masukkan tinggi baru: ");
						float ti = inp.nextFloat();
						arrBangun[id].setPanjang(al);
						arrBangun[id].setTinggi(ti);
						break;
					}
					else if (menu2 == 1){
						System.out.println("Nomor ID?\n(Masukkan angka 1-" + countId + ") ");
						int id = inp.nextInt();
						arrBangun[id].deskripsi();
						System.out.print("Masukkan panjang baru: ");
						float pa = inp.nextFloat();
						System.out.print("Masukkan lebar baru: ");
						float le = inp.nextFloat();
						arrBangun[id].setPanjang(pa);
						arrBangun[id].setTinggi(le);
						break;
					}
					else{
						System.out.println("Masukkan 0 untuk objek Segitiga atau 1 untuk objek Segiempat");
					}
				}
			}
			else if (pilih == 3){
					System.out.println("Objek ID?");//ini langsung ke objeknya aja

					int menu3 = inp.nextInt();
					for (;;){//hapus aja perulangan fornya
						if (menu3 == 0){
							System.out.println("Nomor ID?\n(Masukkan angka 1-" + countId + ") ");
							int id = inp.nextInt();
							arrBangun[id].deskripsi();
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
					//displayBangun(arrBangun);
					for(int j = 0; j < countId; j++){
						System.out.println("ID = " + j + "; Panjang = " + arrBangun[j].getPanjang() + "cm; Tinggi = " + arrBangun[j].getTinggi() + "; Luas = " + arrBangun[j].hitungLuas() + "cm^2");
						//arrBangun[j].deskripsi();
					}
						/*System.out.println("ID = " + j + "; Panjang = " + arrBangun[j].getPanjang() + "cm; Tinggi = " + arrBangun[j].getTinggi() + "; Luas = " + arrBangun[j].hitungLuas() + "cm^2");
					break;
					//	if(j == arrBangun.length){
					//		break;
					//	}
					}*/
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
