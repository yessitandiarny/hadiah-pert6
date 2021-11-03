// nomor 2

import java.util.Scanner;

class Siswa {
	 String nama,jurusan,nim;
	
		void setnama(String namasiswa){
			nama=namasiswa;
		}
		void setjurusan(String jurusansiswa){
			jurusan=jurusansiswa;
		}
		void setnim(String nimsiswa){
		nim=nimsiswa;
		}
		void cetak(){
			System.out.println("nama saya adalah " +nama +" jurusan saya adalah "
			+jurusan +" dan nim saya " +nim);
		}
}

public class hadiahpert6no2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		String a,b,c;
		Siswa s;
		s = new Siswa();
		System.out.print("Nama : ");
		a = input.nextLine();
		s.setnama(a);
		System.out.print("Jurusan : ");
		b = input.nextLine();
		s.setjurusan(b);
		System.out.print("NIM : ");
		c = input.nextLine();
		s.setnim(c);
	
		s.cetak();
	}
}