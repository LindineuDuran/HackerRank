public class GradingStudents
{
    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades)
	{
        /*
         * Write your code here.
         */
        for (int i = 0; i < grades.length; i++)
        {
            int resto = grades[i] % 5;

            if ((resto != 0) && (grades[i] >= 38))
            {
                int gradeTemp = (grades[i] - resto)+5;
                if ((gradeTemp-grades[i] < 3))
                {
                    grades[i] = gradeTemp;
                }
            }
        }

        return grades;
    }

    public static void main(String[] args)
	{
        int[] grades = {73, 67, 38, 33};

        int[] result = gradingStudents(grades);
		
		for (int nota : result)
		{
			System.out.println(nota);
		}
    }
}
