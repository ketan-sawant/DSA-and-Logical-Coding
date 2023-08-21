package pattern;


/*
 
         1
        212
       32123
      4321234
     543212345
      4321234 
       32123
        212
         1
 
 */

public class pat17 {

	public static void main(String[] args) {
		pat30(5);
	}
	
	public static void pat30(int n){
		
		 
		 for(int row=1;row<=2*n;row++) {
		 int totalcols = row<n ? row: (2*n)-row;
		  
		 int totalspaces = n>row ? n-row: row-n;
		 
		 for(int spaces = 1;spaces<=totalspaces;spaces++) {
			 
			 System.out.print(" ");
			 
		 }
		 
		 
			 
			 for(int i = totalcols; i>=1; i--) {
				 System.out.print(i);
			 }
			 
			 for(int i = 2; i<=totalcols;i++) {
				 System.out.print(i);
			 }
			 
		 
		 System.out.println();
				 
		 }
		 
	}
	

}
