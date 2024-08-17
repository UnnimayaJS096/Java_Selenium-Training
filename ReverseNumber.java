package JavaTraining;

public class ReverseNumber {
public static void main(String[] args) {
	int num = 6814, reverse = 0;
	
	System.out.println("Original number: " + num);
	
	// run loop until num becomes 0
	while (num!=0) {
		// run loop until num becomes 0
		int remainder= num % 10;
		reverse = reverse * 10 + remainder;
		// removing the last digit from num
		num = num / 10;		
	}
	System.out.println("Reversed number: " + reverse);
}
}
