package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		
		Product product2 = new Product();
		product2.id = 1;
		product2.name = "Telefon";
		product2.price = 40.000;
		product2.stockAmount = 5;
		product2.description = "Apple Iphone 14";
		productManager.add2(product2.id, product2.name,product2.description,product2.stockAmount,product2.price);
		
		
		Product product = new Product(1,"Laptop","asus laptop",3000,2);
		productManager.add(product);
		
		
		
		System.out.println(product.getDescription());

	}

}
