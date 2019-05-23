public class MiniMaxSum
{
	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr)
    {
        long minSum = 0;
        long maxSum = 0;

        insertionSort(arr);

        for (int i = 0; i < arr.length-1; i++)
        {
            minSum += (long) arr[i];
        }

        for (int i = 1; i < arr.length; i++)
        {
            maxSum += (long) arr[i];
        }

        System.out.println(minSum + " " + maxSum);
        System.out.println("");
    }

    public static void insertionSort(int[] vetor)
    {
        int j;
        int key;
        int i;
        
        for (j = 1; j < vetor.length; j++)
        {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
            {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
    }
    
    public static void main(String[] args)
    {
    	int[] arr1 = {1, 2, 3, 4, 5};
    	miniMaxSum(arr1);
    	
    	int[] arr2 = {7, 69, 2, 221, 8974};
    	miniMaxSum(arr2);
    	
    	int[] arr3 = {396285104, 573261094, 759641832, 819230764, 364801279};
    	miniMaxSum(arr3);
    }
}
