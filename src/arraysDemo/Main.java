package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String student1 = "Uchiha Itachi";
		String student2 = "Uchiha Madara";
		String student3 = "Uchiha Sasuke";
		String student4 = "Uchiha Shisu";
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		System.out.println("---------------------------------------");
		
		String[] students = new String[4];
		students[0]= "Uchiha Itachi";
		students[1]= "Uchiha Madara";
		students[2]= "Uchiha Sasuke";
		students[3]= "Uchiha Shisu";
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("---------------------------------------");
		
		for(String student:students) {
			System.out.println(student);
		}
		
		

	}

}
