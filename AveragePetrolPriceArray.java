package JavaTraining;

public class AveragePetrolPriceArray {
public static void main(String[] args) {
	double petrolprices[] = {12.3, 143.8, 278.3, 987.3, 66.3, 333.3};
	double TotalValue = 0.0;
	
	//calculating the Total value of petrol prices
	for(double metrocities : petrolprices) {
		System.out.println(metrocities);
		TotalValue = TotalValue + metrocities; // or TotalValue += metrocities		
	}
	System.out.println("Total value of petrol prices for the given metro cities: " + TotalValue);
	
	//Calculating the average value
	double AverageValue = TotalValue/petrolprices.length;
	System.out.println("Average value of petrol price: " + AverageValue);
}
}
