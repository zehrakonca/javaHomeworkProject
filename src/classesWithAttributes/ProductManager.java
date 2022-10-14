package classesWithAttributes;

public class ProductManager {
	public void add(Product product) {
		System.out.println("product added! " +product.name);
	}
	
	public void add2(int id, String name,String description,int stockAmount, double price) {
		System.out.println("product added! "+name);
	}
}
