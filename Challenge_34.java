package Challenge;

public class Challenge_34 {

	public static void main(String[] args) {
		
		int num = 10;
		String result = PrimeCheck(num);
		System.out.println(result);  // out put : Not Prime
		 
		for (int i = 2; i <= num; i++) {
			if(CheckPrime(i)) {
				System.out.println(i);  // output : 2 3 5 7
			}
		}
		
		int input1 = 20;   // Range Check Prime Number
		int input2 = 30;
		for (int i = input1; i <= input2; i++) {
			if (CheckPrime(i)) {
				System.out.println(i);  // out put : 23 29
			}
		}
		
		int Number = 20;
		int count = 0;
		
		for (int i = 2; count < Number ; i++) {
			if (CheckPrime(i)) {
				System.out.println(i);  // output : 2 to 71  ... 20 Prime number
				count++;
			}
		}
	}

	private static boolean CheckPrime(int num) {  // Print prime Number
		if (num < 2) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if(num%i == 0)
			{
				return false;
				}
			}
		return true;
	}

	private static String PrimeCheck(int num) {  // Number check Prime
		if (num < 2 ) {
		  return "Not Prime";
		}
		for (int i = 2; i * i <= num; i++) {
			if(num %2 == 0) {
				return "Not Prime";
			}
		}
		
		return "prime";
	}

}
