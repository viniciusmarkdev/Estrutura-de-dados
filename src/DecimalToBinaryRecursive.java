
	public class DecimalToBinaryRecursive {
		
		public static void main(String[] args) {
			
			System.out.println(convert(233));
			
		}
		
		
		
		public static String convert(int n) {
			
			
			//Caso base
			
			//Menor saída ou entrada
			
			//Valor em que a recursão não irá continuar
			
			
			if(n<=0) {
				
				return "";
			}
			
			//menor trabalho que posso realizar em que posso chegar um pouco 
			//mais perto do meu objetivo
			
			int oneOrzero = n%2;
			String st = String.valueOf(oneOrzero);


			return convert(n/2)+st;
			
		}
		
	
	}
