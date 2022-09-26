package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "u-zu-ma-ki naruto rendan!!";
		
		String chooseMessage = message.substring(0,2);
		
		System.out.println(chooseMessage);
		
		String newMessage = giveCity();
		
		System.out.println(newMessage);
		
		int number = total(5,7);
		
		System.out.println(number);
	}
	
	public static void add() {
		System.out.println("added!");
	}
	
	public static void delete() {
		System.out.println("deleted!");
	}
	
	public static void update() {
		System.out.println("updated!");
		return;
	}

	public static int total(int number1, int number2) {
		return number1+number2;
	}
	
	public static String giveCity() {
		return "Konoha";
	}
}
