package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "the weather is very nice today. ";
		System.out.println(message);
		
		System.out.println("number of message: "+message.length());
		System.out.println("fifth element: "+message.charAt(4));
		System.out.println(message.concat("Hooray!"));
		System.out.println(message.startsWith("t"));
		System.out.println(message.endsWith("."));
		
		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		
		System.out.println(characters);
		System.out.println(message.indexOf("ath"));
		
		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);
		System.out.println(message.substring(2,5));
		
		for(String word : message.split("")) {
			System.out.println(word);
		}
	}

}
