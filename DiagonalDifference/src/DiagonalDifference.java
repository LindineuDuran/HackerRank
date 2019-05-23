public class DiagonalDifference
{
	// Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr)
    {
        int primDiag = 0;
        int secDiag = 0;

        //Desenha a matriz
        for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + ", ");
			}
			
			System.out.println("");
		}
        
        for(int i = 0; i < arr.length; i++)
        {
            primDiag +=arr[i][i];
        }

        for(int i = 0; i < arr.length; i++)
        {
            secDiag +=arr[i][arr.length-1-i];
            System.out.println("secDiag = " + secDiag);
        }

        System.out.println("primDiag = " + primDiag);
        System.out.println("secDiag = " + secDiag);
        
        return Math.abs(primDiag-secDiag);
    }
    
    public static void main(String[] args)
    {
    	int[][] arr = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
    	int result = diagonalDifference(arr);
    	System.out.println(result);
    }
}
