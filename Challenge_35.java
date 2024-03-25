package Challenge;

public class Challenge_35 {

	public static void main(String[] args) {
		
		int num = 10;
		for (int i = 0; i < num; i++) {
			int res = FebonaciSeries(i);
			System.out.print(res+" "); //0ut put : 0 1 1 2 3 5 8 13 21 34

		}
		 System.out.println();
		int count = 0;
		 for (int i = 0; count < num; i++) {
	            int res = FebonaciSeries(i);
	            if (res <= num) {
	                System.out.print(res + " "); // out put : 0 1 1 2 3 5 8 
	                count++;
	            }
	        }	
	}

	private static int FebonaciSeries(int num) { // Print 10  febonacci Series number
		if (num == 0 || num==1) {
			return num;
		}
		
		int prev = FebonaciSeries(num - 1);
		int prevprev = FebonaciSeries(num - 2);
		
		return prev + prevprev;
	}

}
