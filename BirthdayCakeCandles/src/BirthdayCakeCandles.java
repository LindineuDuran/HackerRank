public class BirthdayCakeCandles
{
	// Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar)
    {
        int numCandles = 0;
        insertionSort(ar);

        for (int i = ar.length-1; i > -1; i--)
        {
            if (ar[i] == ar[ar.length-1])
            {
                ++numCandles;
            }
        }

        return numCandles;
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
    	int[] arr1 = {3, 2, 1, 3};
    	int numCandles1 = birthdayCakeCandles(arr1);
    	System.out.println(numCandles1);
    }
}
