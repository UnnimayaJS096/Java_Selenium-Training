package JavaTraining;

class Product{
	 int id;
	 String name;
	float price;
	
	void display() {
		System.out.println("id=" + id + "," + " name=" + name);
	}
}
public class ClassObjectProduct {
	public static void main(String[] args) {
		Product pobj = new Product();
		pobj.id = 1;
		pobj.name = "Text Book";
		pobj.price = (float)22.6;
		
		pobj.display();
	}
}
