package methods;

public class Main {

	public static void main(String[] args) {
		findNumber();

	}
	
	public static void findNumber() {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int searchedNumber=7;
		
		boolean isTrue=false;
		
		for(int number:numbers) {
			if (number==searchedNumber)
			{
				isTrue=true;
				break;
			}
		}
		String message="";
		if (isTrue) {
			//System.out.println("sayı mevcuttur: "+ searchedNumber);
			//sendMessage("sayı mevcuttur: ",searchedNumber);
			message = "sayı mevcuttur: "+searchedNumber;
			sendMessage(message);
			
		}
		else {
			System.out.println("sayı mevcut değildir: "+searchedNumber);
		}
	}
	
	public static void sendMessage(String message, int searchedNumber) {
		System.out.println("sayı mevcuttur: "+searchedNumber);
	}
	
	public static void sendMessage(String message) {
		System.out.println("sayı mevcuttur: ");
	}

}
