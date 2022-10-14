package staticDemo;

public class DatabaseHelper {
	public static class crud {
		public static void delete () {
			System.out.println("data has been deleted.");
		}
		public static void update() {
			System.out.println("data has been updated.");
		}
	}
	
	public static class connection{
		public static void createConnection() {
			System.out.println("connection has been created and opened.");
		}
	}
}
