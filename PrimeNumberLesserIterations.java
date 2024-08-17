package JavaTraining;

import java.util.Scanner;

public class PrimeNumberLesserIterations {
	private static Scanner sc;
	public static void main(String[] args) {
		int n, i, count = 0;
		sc= new Scanner(System.in);
		
		System.out.println("Please enter any Integer: ");
		n = sc.nextInt();
		
		for(i=2; i<=n/2; i++) {
			if(n % i == 0) {
				count++;
				break;
			}
		}
		if(count == 0 && n!= 1) {
			System.out.println(n+ " is a Prime number");
		}
		else {
			System.out.println(n+ " is not a Prime number");
		}
	}
}
