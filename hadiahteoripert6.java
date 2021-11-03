// nomor 1

import java.util.Scanner;
class lingkaran {
	double l,r;
	double phi = 3.14;
	Scanner input = new Scanner(System.in);
	
	double jari(){	
	System.out.print("Masukkan jari-jari = ");
	return	r = input.nextDouble();	
	}
	
 	double luas(){
 	  return l = phi*r;
 	}
}

class kubus {
	double p,l,t,v;
	Scanner input = new Scanner(System.in);
	
	void sisi(){
		System.out.print("Masukkan panjang = ");
		p = input.nextDouble();
		System.out.print("Masukkan lebar = ");
		l = input.nextDouble();
		System.out.print("Masukkan tinggi = ");
		t = input.nextDouble();
	}
	
	double volume(){
		return v = p*l*t;
	}
	
}
public class hadiahteoripert6{
	public static void main(String[] args){
		int a;
		
		Scanner input = new Scanner(System.in);
		System.out.println("1. Menghitung Luas Lingkaran");
		System.out.println("2. Menghitung Volume Kubus");
		System.out.print("Pilih 1/2 :");
		a = input.nextInt();
		if (a==1) {
			System.out.println("Menghitung Luas Lingkaran");
			lingkaran ling = new lingkaran();
		
		System.out.println("Phi = 3.14");
		ling.jari();
		System.out.println("Luas Lingkaran = " +ling.luas());
		} else if (a==2){
			System.out.println("Menghitung Volume Kubus");
		kubus kub = new kubus();
		kub.sisi();
		System.out.println(kub.volume());	
		} else {
			System.out.println("Salah Input!!");
		}
		
		
		
		}
		}