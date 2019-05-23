public class PlusMinus
{
	// Complete the plusMinus function below.
	static void plusMinus(int[] arr)
	{
		int numTot = arr.length;
		int numPlus = 0;
		int numMinus = 0;
		int numZeros = 0;
		
		double positive, negative, zero;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > 0)
			{
				++numPlus;
			}
			else if (arr[i] < 0)
			{
				++numMinus;
			}
			else
			{
				++numZeros;
			}
		}
		
		System.out.println("Plus: " + numPlus + ", Minus: " + numMinus + ", Zeros: " + numZeros + ", Total: " + numTot);
		
		positive = (double) numPlus / numTot;
		System.out.printf("%.6f", positive);
		System.out.println("");
		
		negative = (double) numMinus / numTot;
		System.out.printf("%.6f", negative);
		System.out.println("");
		
		zero = (double) numZeros / numTot;
		System.out.printf("%.6f", zero);
		System.out.println("");
		System.out.println("");
	}
	
	public static void main(String[] args)
	{
		int[] arr1 = {-4, 3, -9, 0, 4, 1};
		plusMinus(arr1);
		
		int[] arr2 = {1, 2, 3, -1, -2, -3, 0, 0};
		plusMinus(arr2);
	}
}
