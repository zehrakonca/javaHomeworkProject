package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.topla(5, 7);
		dortIslem.bol(10, 5);
		dortIslem.cikar(9, 3);
		dortIslem.carp(1, 56);
		
		System.out.println(sonuc);
	}

}
