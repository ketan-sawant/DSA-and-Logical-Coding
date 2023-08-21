package pattern;

/*  
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
    
 */
public class pattern30 {

	public static void main(String[] args) {
		pat30(5);
	}
	
	 public static void pat30(int n){
		
		 
		 for(int row=1;row<=n;row++) {
		 int totalcols = (2*row) - 1;
		  
		 int totalspaces = n-row;
		 
		 for(int spaces = 1;spaces<=totalspaces;spaces++) {
			 
			 System.out.print(" ");
			 
		 }
		 
		 //for(int col = 1 ; col<=totalcols; col++) {
			 
			 for(int i = row; i>=1; i--) {
				 System.out.print(i);
			 }
			 
			 for(int i = 2; i<=row;i++) {
				 System.out.print(i);
			 }
			 
		 //}
		 System.out.println();
				 
		 }
		 
	}
	
}
