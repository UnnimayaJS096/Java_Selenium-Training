package JavaTraining;

import java.util.Scanner;

public class FactorialMethodFn {
	private static Scanner sc;
public static void main(String[] args) {
	int n;
	
	sc= new Scanner(System.in);
	
	System.out.println("Please enter any Integer: ");
	n = sc.nextInt();
	
	System.out.println("Factorial of" + n + "is " + fact(n));
}

static int fact(int n) {
	int result = 1;
	while(n >= 1) {
		result = result * n;//or result *= n
		n--;
	}
	return result;
}
}
