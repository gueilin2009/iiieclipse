public class Factor {
	
	static int factorial(int n){
	int result = 1;
		for (int i = n; i >= 1; i--) 
   		result *= i;
		return result;
		}
	
	public static void main(String[] args) {
		System.out.println("" + factorial(10));
		System.out.println("" + factorial(11));
		
   
	}

}


