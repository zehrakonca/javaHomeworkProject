package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String [][] cities = new String [3] [3];
		
		cities [0][0] = "Aydýn";
		cities [0][1] = "Muðla";
		cities [0][2] = "Ýzmir";
		cities [1][0] = "Ýstanbul";
		cities [1][1] = "Bursa";
		cities [1][2] = "Ankara";
		cities [2][0] = "Çanakkale";
		cities [2][1] = "Balýkesir";
		cities [2][2] = "Isparta";
		
		for(int i= 0; i<=2; i++) {
			System.out.println("-----------------------------");
			for(int j=0; j<=2; j++) {
				System.out.println(cities[i][j]);
			}
		}
	}

}
