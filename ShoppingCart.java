package JavaTraining;

class ShoppingCartDemo {
//data members
	//array of products
     Products aprod[];
	 int cindex;
	
	//constructor
	public ShoppingCartDemo(){
	    aprod = new Products [5];
		cindex = 0;
	}
	
	//member methods
	//add product
	 public Products addProduct(Products prod) {
		aprod[cindex] = prod;
		cindex++;
		System.out.println("Added Product with id " + prod.id);
		return prod;
	}
	
	//List Products
	 public void listProducts() {
		//enhanced for loop
		for (int i=0; i < cindex; i++) {
			aprod[i].display();
		}
	}
	
	//empty shopping cart
	 public void emptyCart() {
		aprod = new Products [5];
		cindex = 0;
		System.out.println("Deleted all products from Shopping Cart");
	}	
	//checkout
	//calculate total amount and print
}

class Products {
	int id;
	String name;
	
	//constructors
	  Products(){
		id = 0;
		name = "";
	}
	  Products (int pid, String pname){
		id=pid;
		name=pname;
	}
	//member method
	 void display() {
		System.out.println("id=" + id + "," + " name=" + name);
	}
}

public class ShoppingCart {
  public static void main(String[] args) {
	ShoppingCartDemo scart = new ShoppingCartDemo();
	
	Products p1 = new Products(100, "Mobile");
	scart.addProduct(p1);
	

	Products p2 = new Products(200, "Clothing");
	scart.addProduct(p2);
	
	scart.listProducts();
	
	scart.emptyCart();
	
	scart.listProducts();
}
}
