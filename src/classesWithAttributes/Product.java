package classesWithAttributes;

public class Product {
	int id;
	String name;
	String description;
	double price;
	int stockAmount;
	
	public Product(int id,String name,String description,double price,int stockAmount) {
		System.out.println("yapýcý blok çalýþýyor!");
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
	}
	
	public Product () {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		id= this.id;
	}
}
