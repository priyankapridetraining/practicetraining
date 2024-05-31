package program;

public class Multidimensionalarraytask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] pattern = {
				
				{'*', '*', '*', '*', '*'}, 
				{' ', '*', '*', '*', ' '}, 
				{' ', ' ', '*', ' ', ' '}
		};
	
		
		for (int i = 0; i < pattern.length; i++) {
			for (int j = 0; j < pattern[i].length; j++) {
				System.out.print(pattern[i][j] + " ");
			}
			
			System.out.println();
		}

}
	
}
