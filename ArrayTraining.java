package JavaTraining;

public abstract class ArrayTraining {

	public static void main(String[] args) {
		int pincome[]=new int [5];
		pincome[0]=32;
		pincome[1]=21;
		pincome[2]=11;
		pincome[3]=34;
		pincome[4]=56;
		
		print(pincome);
		
		int [] rpincome= reverse (pincome);
		System.out.println("Reversed Array Below----");
		print(rpincome);
		
		for (int i=0; i<pincome.length; i++) {
			System.out.println("PerCapita income of City " +i+ " is " +pincome[i]);
		}
		
		System.out.println("---------------------------");
		
		//for (int i=pincome.length-1; i>=0; i--) {
		//	System.out.println("(From last) PerCapita income of City " +i+ " is " +pincome[i]);
		}
		//int min_pincome=pincome[0];
		//for (int i=1; i<pincome.length;i++) {
			//if(min_pincome>pincome[i]) {
				//min_pincome=pincome[i];
		//	}
		//}
		//System.out.println("---------------------------");
		
	//	System.out.println("Min PerCapita income is " +min_pincome);
		
		static void print(int[] arr) {
			System.out.println("-----------Display Begin-----------------");
			for (int i=0;i<arr.length;i++) {
				System.out.println("PerCapita income of City " +i+ " is " +arr[i]);	
			}
			System.out.println("-----------Display End-----------------");	
		}
		
		
		static int[] reverse (int[] avalues) {
			int n=avalues.length, tmp;
			for (int i=0;i<n/2;i++) {
				tmp=avalues[i];
				avalues[i]=avalues[n-i-1];
				avalues[n-i-1]=tmp;			
			}
			return avalues;
	}
	}

