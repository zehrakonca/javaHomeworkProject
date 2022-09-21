package loopDemo;

public class Main {

	public static void main(String[] args) {
		for (int i=2; i<7; i+=1)
		{
			System.out.println(i);
		}
		System.out.println("for loop is finished.");
		
		int j=1;
		while (j<10)
		{
			System.out.println(j);
			j++;
		}
		System.out.println("While loop is finished.");
		
		int k=1;
		do {
			//System.out.println("logged.");
			System.out.println(k);
			k++;
		}
		while (k<10);
		System.out.println("While loop is finished.");
		
	}
	

}
