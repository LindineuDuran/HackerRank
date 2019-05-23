public class KangarooJumps
{
	// Complete the kangaroo function below.
	static String kangaroo(int x1, int v1, int x2, int v2)
	{
		String result = "NO";
		
		for(int i = 1; i <= 10000; i++)
		{
			if(x1+(v1*i) == x2+(v2*i))
			{
				result = "YES";
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		int x1 = 0;
		int v1 = 3;
		int x2 = 4;
		int v2 = 2;
		
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
		
		x1 = 0;
		v1 = 3000;
		x2 = 4000;
		v2 = 2000;
		
		result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
		
		x1 = 0;
		v1 = 2;
		x2 = 5;
		v2 = 3;
		
		result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
		
		x1 = 0;
		v1 = 2000;
		x2 = 5000;
		v2 = 3000;
		
		result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
	}
}
