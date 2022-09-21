package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 2;
		int remainder = number %2;
		
		boolean isPrime = true;
		
		if (number==1)
		{
			System.out.println("not a prime number. ");
			return;
		}
		if(number<2) {
			System.out.println("Unvalid number.");
		}
		for(int i= 2; i<number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("the number is a prime. your number: "+number);
		}
		else {
			System.out.println("this number not a prime number. your number: "+number);
		}

	}

}
