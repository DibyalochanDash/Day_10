package Challenge;

public class Challenge_30_31 {
	
	private static int Factorial(int num) {  // Using Recursion 
		
		if (num == 0) {
			return 1;
		}
		
		return num * Factorial(num - 1);	
	}

	public static void main(String[] args) {
   
		int num = 10;
		
		int result = Sum(num);
		System.out.println(result);
		
	       int res = Factorial(num);
	       System.out.println(res);
		 
		
		if (num < 2) {
			System.out.println(1);
			 return ;
		}
		int i = 2;    //  Factorial Number
		long fact = 1;
		while (i <= num) {
			fact *= i;
			i++;
		}
       System.out.println(fact);
       
       int number = 56787;
       int results  = SumNumber(number);
       System.out.println(results);
       
	}

	private static int SumNumber(int number) {  // Sum of Integer Number
		int sum = 0;
		
		int i = 0;
		while (number > 0) {
			sum += number % 10;
			number/=10;
		}
		return sum;
	}

	private static int Sum(int num) {  // Sum of  Number
		 int sum = 0;
		 int i = 0;
		 while (i <= num) {
			sum += i;
			i++;
		}
		return sum;
	}


}
