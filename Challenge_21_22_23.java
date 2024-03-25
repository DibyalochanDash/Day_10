package Challenge;

public class Challenge_21_22_23 {

	public static void main(String[] args) {
		
		int a = 12; // 1100
		int b = 5; // 0101
		
		int result = a & b;  // &  operator use bitwise  
		
		int c = 12; //1100
		int d = 5;  // 0101
		
		int results = a | b; // OR operator use bitwise
		
		int e = 12; //1100
		int f = 5; //0101 
		
		int resultss = e ^ f;

		System.out.println(result); //0100 = 4;
		System.out.println(results); //1101 = 13;
		System.out.println(resultss); //1001 = 9;
		
	}

}
