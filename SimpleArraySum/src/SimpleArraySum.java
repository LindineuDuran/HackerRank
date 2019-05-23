public class SimpleArraySum
{
    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar)
    {
        /*
         * Write your code here.
         */
        int arCount = ar.length;
        int result = 0;
        if (arCount > 0)
        {
            for(int item:ar)
            {
                result += item;
            }
        }

        return result;      
    }

    public static void main(String[] args)
	{
        int arCount = 6;
		String input = "1 2 3 4 10 11";
        int[] ar = new int[arCount];

        String[] arItems = input.split(" ");

        for (int arItr = 0; arItr < arCount; arItr++)
		{
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);
        System.out.println(result);
    }
}