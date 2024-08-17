package JavaTraining;

public class FibonacciSeries {
public static void main(String[] args) {
	int n=18, firstNum=0, secondNum=1;
	int nextNum;
	System.out.println("Fibonacci series until 1000:");
	for (int i=2; i<=n; i++) {
		nextNum =firstNum + secondNum;
		System.out.println(firstNum + " ");
		firstNum = secondNum;
		secondNum = nextNum;
	}
}
}
