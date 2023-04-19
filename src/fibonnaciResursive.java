
public class fibonnaciResursive {
	
	public static void main(String[] args) {
		
		System.out.println(fibonnaci(35));
		
		
	}
	
	
	public static int fibonnaci(int n) {
		
		if(n==1 || n==0) {
			
			return n;
		}
		
		return fibonnaci(n-1)+fibonnaci(n-2);
	}

}
