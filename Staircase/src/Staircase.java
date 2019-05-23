public class Staircase
{
	// Complete the staircase function below.
	static void staircase(int n)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n - i - 1; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++)
			{
				System.out.print("#");
			}

			System.out.println(" ");
		}
	}

	public static void main(String[] args)
	{
		int n = 6;
		staircase(n);
	}
}