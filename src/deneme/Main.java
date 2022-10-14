package deneme;

public class Main {

	public static void main(String[] args) {
		
		String str = "ayşe";
		System.out.println(chooseLast(str)+"***");
	}
	
	public static String chooseLast(String str)
	{
		if(str.length()>3) {
			str = str.substring(0, str.length()-2);
		}
		else if(str.length()>5) {
			str = str.substring(0, str.length()-4);
		}
		else if(str.length()>8) {
			str = str.substring(0, str.length()-6);
		}
		return str;
	}

}
