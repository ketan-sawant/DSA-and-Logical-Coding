package pattern;

public class pattern28 {

	public static void main(String[] args) {
		pat28(5);
	}
	
	public static void pat28(int n) {
		for(int row = 1; row<2*n;row++) {
			int totalnocols = row>n ? 2*n-row : row;
			
			int totalspaces = n - totalnocols;
			
			for(int space = 1;space<=totalspaces; space++) {
				
				System.out.print(" ");
				
			}
			
			for(int col = 1 ; col<=totalnocols ; col++ ) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
	
}
