package Challenge;

public class Challenge_27_28_29 {

	public static void main(String[] args) {
		
		int num = 21;  // bitwise Operator Check number Even or Odd
		
		if ((num & 1)==1) {
			System.out.println("Odd Number.");
			
		} else {
			System.out.println("Even Number.");

		}
		
		int number = 9;  // Multiplication Table
		
		int i = 1;
		while (i <= 10) {
			System.out.println(number + " X " + i + " = " + (number * i));
			i++;
		}
		
		int nums = 10;  // Odd number Sum
		
		int sum = 0;
		int  j = 1;
		  while (j <= nums) {
			sum += j;
			j += 2;
		}
      System.out.println(sum);
      
      
         int numss = 10;   // Even Number Sum
         
         int sums = 0;
         
         int k = 0;
         while (k<=numss) {
			sums += k;
			k += 2;
		}
         System.out.println(sums);
	}

}
