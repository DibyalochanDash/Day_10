package Challenge;

public class Challenge_32_33 {

	public static void main(String[] args) {
		
		int a = 15;
		int b =  20;
		
		int res = GCD(a,b);
		System.out.println(res);
		
		int ress = LCM(a,b);
		System.out.println(ress);

	}

	private static int LCM(int a, int b) {
		
		return (a * b) / GCD(a,b);
	}

	private static int GCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return GCD(b,a%b);
	}

}
