package Challenge;

public class Challenge_36_37_38 {

	public static void main(String[] args) {
		int num = 53865;
		
		int res = ReverseDigitNumber(num);
		System.out.println(res); // output : 56835
		
		int armNum = 153;
		
		ArmstrongNumberCheck(armNum);
		
		int number = 1221;
		
		boolean check = CheckNumberPalindrome(number);
		if (check) {
			System.out.println("Palindrome");
		} else {
            System.out.println("Not Palindrome");
		}

	}

	private static boolean CheckNumberPalindrome(int number) {
		if (number < 10) {
			return false;
		}
	     int originalNum = number;
	     int rev = 0;
	     while (number > 0) {
			int digit = number % 10;
			 rev = rev *10 + digit;
			 number /= 10;
			 
			 
		}
	     return rev == originalNum;
		
	}

	private static void ArmstrongNumberCheck(int armNum) {
		int sum = 0;
		int original = armNum;
		
		while (armNum > 0) {
			int rem = armNum % 10;
			sum = sum + (rem*rem*rem);
			armNum /= 10;
		}
		if (sum == original) {
			System.out.println("Armstrong ");
		} else {
           System.out.println("Not Armstrong ");
		}
		
	}

	private static int ReverseDigitNumber(int num) { // Reverse Digit
	     if (num < 9) {
			return num;
		}
	     int reverse = 0;
	     while (num > 0) {
			int digit = num%10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
	     return reverse;
	}

}
