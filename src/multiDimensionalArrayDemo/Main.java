package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String [][] cities = new String [3] [3];
		
		cities [0][0] = "Ayd�n";
		cities [0][1] = "Mu�la";
		cities [0][2] = "�zmir";
		cities [1][0] = "�stanbul";
		cities [1][1] = "Bursa";
		cities [1][2] = "Ankara";
		cities [2][0] = "�anakkale";
		cities [2][1] = "Bal�kesir";
		cities [2][2] = "Isparta";
		
		for(int i= 0; i<=2; i++) {
			System.out.println("-----------------------------");
			for(int j=0; j<=2; j++) {
				System.out.println(cities[i][j]);
			}
		}
	}

}
