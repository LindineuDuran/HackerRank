import java.io.*;
import java.util.*;

public class VeryBigSum
{

	// Complete the aVeryBigSum function below.
	static long aVeryBigSum(long[] ar)
	{
		long result = 0;

		for (long item : ar)
		{
			result += item;
		}

		return result;
	}

	public static void main(String[] args) throws IOException
	{
		int arCount = 5;
		long[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};

		long result = aVeryBigSum(ar);
		System.out.println(result);
	}
}