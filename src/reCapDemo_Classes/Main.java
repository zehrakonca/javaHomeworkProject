package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(5, 7);
		dortIslem.Bol(10, 5);
		dortIslem.Cikar(9, 3);
		dortIslem.Carp(1, 56);
		
		System.out.println(sonuc);
	}

}
