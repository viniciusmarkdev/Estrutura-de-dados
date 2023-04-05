public class CallStackRecursion {

	public static int fact(int x) {
		
		if(x==0) {
			
			return 1;
		}
		
		return x*fact(x-1);
	}
	
	public static void main(String[] args) {
	
		fact(3);
	}
}
