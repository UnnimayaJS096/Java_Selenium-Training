package JavaTraining;

class ProductDetails{
	private int id;
	private String name;
	//constructors
	 ProductDetails(){
		id = 0;
		name = "";
	}
	 ProductDetails (int pid, String pname){
		id=pid;
		name=pname;
	}
	//member method
	void display() {
		System.out.println("id = " + id + "," + " name = " + name);
	}
}
public class ConstructClassMethodsDemo {
	public static void main(String[] args) {
		ProductDetails pobj = new ProductDetails(101, "Furniture - Sofa Set");
		
		pobj.display();
		
		ProductDetails apobj [] = new ProductDetails [3];
		apobj [0] = new ProductDetails (100, "Mobile");
		apobj [1] = new ProductDetails (101, "TV");
		apobj [2] = new ProductDetails (102, "Table");
		
		//enhanced for loop
		for ( ProductDetails prod : apobj)
		{
			prod.display();
		}
	}
}
