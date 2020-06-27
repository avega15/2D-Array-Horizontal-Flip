
//The famous Fizz Buzz question!
//Print Fizz if divisible by 3, Buzz if divisible by 5, FizzBuzz if divisible my 3 and 5!
public class horizontalFlip{
	public static void main(String[] args) {
		int[][] matrix = {
						{1, 2, 3},
						{2, 5, 8},
						{2, 4, 7},
						{4, 6, 9}};
		
		
		System.out.println("2D Array before being flipped horizontally");
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println();
		}
		
		flipper(matrix);
		
		System.out.println("2D Array after being flipped horizontally");
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println();
		}
	}

	
	
	public static void flipper(int[][] matrix){
		int row = matrix.length;
		int[] temp = matrix[0];        
		
		for(int i = 0; i < row / 2; i++){
			temp = matrix[i];
			matrix [i] = matrix[row - 1 - i];
			matrix[row - 1 - i] = temp;
		
		}
	}
}
