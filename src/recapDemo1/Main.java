package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 1;
		int number2= 26;
		int number3 = 7;
		
		int maxNumber = number1;
		
		if (maxNumber< number2)
		{
			maxNumber = number2;
		}
		
		if(maxNumber < number3)
		{
			maxNumber = number3;
		}
		
		System.out.println("the biggest number= "+maxNumber);

	}

}
