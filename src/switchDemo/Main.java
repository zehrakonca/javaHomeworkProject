package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A': 
			System.out.println("Excellent!, you passed! your degree: "+grade);
			break;
		case 'B': 
			System.out.println("Great!,you passed! your degree: "+grade);
			break;
		case 'C': 
			System.out.println("Good!, you passed! your degree: "+grade);
			break;
		case 'D': 
			System.out.println("Not bad! : you passed! your degree: "+grade);
			break;
		case 'F': 
			System.out.println("Unfortunately, you couldn't pass. your degree: "+grade);
			break;
			default:
				System.out.println("you entered an invalid note. your entered note: "+grade);
		}

	}

}
