package school.inventory;

public class Product {
	private String name;
	private double price;
	private int amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null && !name.isEmpty())
			this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0)
			this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		if(amount>0)
			this.amount = amount;
	}
	public Product(String name, double price, int amount) {
		super();
		setAmount(amount);;
		setName(name);
		setPrice(price);
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", amount=" + amount + "]";
	}
	
}
