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
			//System.out.println("say� mevcuttur: "+ searchedNumber);
			//sendMessage("say� mevcuttur: ",searchedNumber);
			message = "say� mevcuttur: "+searchedNumber;
			sendMessage(message);
			
		}
		else {
			System.out.println("say� mevcut de�ildir: "+searchedNumber);
		}
	}
	
	public static void sendMessage(String message, int searchedNumber) {
		System.out.println("say� mevcuttur: "+searchedNumber);
	}
	
	public static void sendMessage(String message) {
		System.out.println("say� mevcuttur: ");
	}

}
