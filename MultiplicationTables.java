package JavaTraining;

public class MultiplicationTables {
	

	public static void main(String[] args) {
		for (int j=1; j<=10; j++) {
			System.out.println("< " + j + "x >");
			for (int i=1; i<=10; i++) {				
				System.out.println(j + " x " + i + " = " + j * i);			
			}
		}
	}
}
