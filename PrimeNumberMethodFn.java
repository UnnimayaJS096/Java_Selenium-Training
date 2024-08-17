package JavaTraining;

import java.util.Scanner;

public class PrimeNumberMethodFn {
	private static Scanner sc;
	public static void main(String[] args) {
		int n;
		sc= new Scanner(System.in);
		
		System.out.println("Please enter any Integer: ");
		n = sc.nextInt();

		checkPrime(n);
		}
	
	 static void checkPrime(int n) {
		int count=0;
		for(int i=2; i<=n/2; i++) {
			if(n % i == 0) {
				count++;
				break;
			}	
		}
			if(count != 0) {
			System.out.println(n+ " is not a Prime number");
			}
			else {
				System.out.println(n+ " is a Prime number");
			}
	}
	}