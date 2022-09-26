package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		System.out.println("product added! " +product.name);
	}
	
	public void Add2(int id, String name,String description,int stockAmount, double price) {
		System.out.println("product added! "+name);
	}
}
