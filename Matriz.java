public class Matriz{
	
	//multiplica dos matrices
		public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
		    int rows1 = matrix1.length;
		    int cols1 = matrix1[0].length;
		    int rows2 = matrix2.length;
		    int cols2 = matrix2[0].length;
		    
		    if (cols1 != rows2) {
		        System.out.println("No se pueden multiplicar las matrices. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
		        return null;
		    }
		    
		    int[][] result = new int[rows1][cols2];
		    
		    for (int i = 0; i < rows1; i++) {
		        for (int j = 0; j < cols2; j++) {
		            for (int k = 0; k < cols1; k++) {
		                result[i][j] += matrix1[i][k] * matrix2[k][j];
		            }
		        }
		    }
		    
		    // Imprimir la matriz resultante
		    for (int i = 0; i < rows1; i++) {
		        for (int j = 0; j < cols2; j++) {
		            System.out.print(result[i][j] + " ");
		        }
		        System.out.println();
		    }
			return result;
		}

		//transpone matriz
		public static int[][] transposeMatrix(int[][] matrix) {
		    int rows = matrix.length;
		    int cols = matrix[0].length;
		    
		    int[][] result = new int[cols][rows];
		    
		    for (int i = 0; i < rows; i++) {
		        for (int j = 0; j < cols; j++) {
		            result[j][i] = matrix[i][j];
		        }
		    }
		    
		    return result;
		}

		//suma diagonal
		public static int sumDiagonal(int[][] matrix) {
		    int sum = 0;
		    int size = matrix.length;
		    
		    for (int i = 0; i < size; i++) {
		        sum += matrix[i][i];
		    }
		    
		    return sum;
		}
		
		
		//maximo
		public static int findMaxValue(int[][] matrix) {
		    int max = Integer.MIN_VALUE;
		    int rows = matrix.length;
		    int cols = matrix[0].length;
		    
		    for (int i = 0; i < rows; i++) {
		        for (int j = 0; j < cols; j++) {
		            if (matrix[i][j] > max) {
		                max = matrix[i][j];
		            }
		        }
		    }
		    
		    return max;
		}
		
		//suma dos matrices
		public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
		    int rows = matrix1.length;
		    int cols = matrix1[0].length;
		    
		    int[][] result = new int[rows][cols];
		    
		    for (int i = 0; i < rows; i++) {
		        for (int j = 0; j < cols; j++) {
		            result[i][j] = matrix1[i][j] + matrix2[i][j];
		        }
		    }
		    
		    return result;
		}
		
		
		
		//multiplica matriz por un escalar
		public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
		    int rows = matrix.length;
		    int cols = matrix[0].length;
		    int[][] result = new int[rows][cols];
		    
		    for(int i = 0; i < rows; i++) {
		        for(int j = 0; j < cols; j++) {
		            result[i][j] = matrix[i][j] * scalar;
		        }
		    }
		    
		    return result;
		}
	public static void main(String[] args) {

        
        int[][] matrix1 = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        
        int[][] matrix2 = {{9, 8, 7},
                           {6, 5, 4},
                           {3, 2, 1}};
        
        int[][] matrix3 = {{1, 2},
                           {3, 4},
                           {5, 6}};
        
        int[][] matrix4 = {{1, 2, 3},
                           {4, 5, 6}};
        
        int[][] matrix5 = {{2, 4},
                           {6, 8}};
        
        int scalar = 3;
        
        // Multiplicar dos matrices
        System.out.println("Matriz 1:");
        printMatrix(matrix1);
        System.out.println("Matriz 2:");
        printMatrix(matrix2);
        int[][] result1 = multiplyMatrices(matrix1, matrix2);
        System.out.println("Resultado de la multiplicación:");
        printMatrix(result1);
        
        // Transponer una matriz
        System.out.println("Matriz 3:");
        printMatrix(matrix3);
        int[][] result2 = transposeMatrix(matrix3);
        System.out.println("Matriz transpuesta:");
        printMatrix(result2);
        
        // Sumar los elementos de la diagonal principal de una matriz cuadrada
        System.out.println("Matriz 1:");
        printMatrix(matrix1);
        int sum = sumDiagonal(matrix1);
        System.out.println("La suma de la diagonal principal es " + sum);
        
        // Encontrar el valor más grande de una matriz
        System.out.println("Matriz 2:");
        printMatrix(matrix2);
        int max = findMaxValue(matrix2);
        System.out.println("El valor máximo de la matriz es " + max);
        
        // Sumar dos matrices
        System.out.println("Matriz 4:");
        printMatrix(matrix4);
        System.out.println("Matriz 5:");
        printMatrix(matrix5);
        int[][] result3 = addMatrices(matrix4, matrix5);
        System.out.println("Resultado de la suma:");
        printMatrix(result3);
        
        // Multiplicar una matriz por un escalar
        System.out.println("Matriz 1:");
        printMatrix(matrix1);
        System.out.println("Escalar: " + scalar);
        int[][] result4 = multiplyByScalar(matrix1, scalar);
        System.out.println("Resultado de la multiplicación por escalar:");
        printMatrix(result4);
        
    }
   

	// Método para imprimir una matriz
    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}