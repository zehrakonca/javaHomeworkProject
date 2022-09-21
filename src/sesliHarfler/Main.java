package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char character = 'E';
		
		switch (character) {
		case 'A':
		case 'B':
		case 'O':
		case 'U':
			System.out.println("Kalýn sesli harf");
			break;
			default:
				System.out.println(character+" : ince sesli harf");
		}

	}

}
