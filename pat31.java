package pattern;


/*       
         4 4 4 4 4 4 4  
         4 3 3 3 3 3 4   
         4 3 2 2 2 3 4   
         4 3 2 1 2 3 4   
         4 3 2 2 2 3 4   
         4 3 3 3 3 3 4   
         4 4 4 4 4 4 4 
*/


public class pat31 {

	public static void main(String[] args) {
		pat31(5);
		
		
	}
	
	public static void pat31(int n) {
		
		for(int row = 1;row<2*n;row++) {
			for(int col = 1;col<2*n;col++) {
				
				int up = row;
				int down = 2*n-row;
				int left = col;
				int right = 2*n-col;
				int s = Math.min(left, right);
				int h = Math.min(down, up);
				
				System.out.print(n-Math.min(s,h)+" ");
				
			}
			System.out.println();
		}
		
		
	}
	
}
