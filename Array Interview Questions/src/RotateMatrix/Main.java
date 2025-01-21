package RotateMatrix;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		int n = 3;
		System.out.println("Original Matrix : ");
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0;i < n;i++) {
			for(int j = i;j < n;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}	
		}
		
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n/2;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n-j-1];
				matrix[i][n-j-1] = temp;
			}
		}
		
		System.out.println("Rotated Matrix : ");
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
