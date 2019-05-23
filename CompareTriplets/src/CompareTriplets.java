import java.io.*;
import java.util.*;

public class CompareTriplets
{
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b)
    {
        List<Integer> result = new ArrayList<Integer>(2);
        int resultA = 0;
        int resultB = 0;

        Iterator<Integer> itrA = a.iterator();
        Iterator<Integer> itrB = b.iterator();

        // Checking the next element availability 
        while (itrA.hasNext()) 
        { 
            // moving cursor to next element 
            int valA = (Integer)itrA.next();
            int valB = (Integer)itrB.next();

            if (valA > valB)
            {
                ++resultA;
            }
            else if (valA < valB)
            {
                ++resultB;
            }
        }
        result.add(resultA);
        result.add(resultB);
        
        return result;
    }

    public static void main(String[] args) throws IOException
	{
        List<Integer> a = new ArrayList<Integer>(3);
		//5 6 7
		a.add(5);
		a.add(6);
		a.add(7);
		
		//17 28 30
		
        List<Integer> b =  new ArrayList<Integer>(3);
		//3 6 10
		b.add(3);
		b.add(6);
		b.add(10);
		
		//99 16 8

        List<Integer> result = compareTriplets(a, b);
        
        for (int item : result)
        {
        	System.out.println(item);
        }
    }
}
