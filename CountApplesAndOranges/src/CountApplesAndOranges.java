import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountApplesAndOranges
{
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples,
			int[] oranges)
	{
		// Quantidade das frutas que cairam na casa do Sam
		int qtdMacas = 0;
		int qtdLaranjas = 0;

		// Conta as maçãs
		for (int fruta : apples)
		{
			long distancia = (long) a + fruta;
			if ((distancia >= s) && (distancia <= t))
			{
				++qtdMacas;
			}
		}

		// Conta as laranjas
		for (int fruta : oranges)
		{
			long distancia = (long) b + fruta;
			if ((distancia >= s) && (distancia <= t))
			{
				++qtdLaranjas;
			}
		}

		System.out.println(qtdMacas);
		System.out.println(qtdLaranjas);
		System.out.println("------------------------");
	}

	public static void main(String[] args)
	{
		// Posição inicial (s) e final (t) da casa
		int s = 0;
		int t = 0;

		// Posições das árvores: árvore da esquerda (a); árvore da direita (b)
		int a = 0;
		int b = 0;

		// //Quantidade de maçãs (m) e quantidade de laranjas (n)
		// int m = 0;
		// int n = 0;

		// Valores para teste 1
		s = 7;
		t = 11;
		a = 5;
		b = 15;

		int[] macas1 =
		{ -2, 2, 1 };
		int[] laranjas1 =
		{ 5, -6 };

		countApplesAndOranges(s, t, a, b, macas1, laranjas1);

		// Valores para teste 2
		s = 7;
		t = 10;
		a = 4;
		b = 12;

		int[] macas2 =
		{ 2, 3, -4 };
		int[] laranjas2 =
		{ 3, -2, -4 };

		countApplesAndOranges(s, t, a, b, macas2, laranjas2);

		// Valores para teste 3
		String nomeArquivo = "C:\\Users\\lsdur\\Documents\\GitHub\\HackerRank\\CountApplesAndOranges\\src\\input03.txt";
		try
		{
			File arquivo = new File(nomeArquivo);
			Scanner sc = new Scanner(arquivo);

			String[] st = sc.nextLine().split(" ");
			s = Integer.parseInt(st[0]);
			t = Integer.parseInt(st[1]);

			String[] ab = sc.nextLine().split(" ");
			a = Integer.parseInt(ab[0]);
			b = Integer.parseInt(ab[1]);

			String[] mn = sc.nextLine().split(" ");
			int m = Integer.parseInt(mn[0]);
			int n = Integer.parseInt(mn[1]);

			int[] apples = new int[m];

			String[] applesItems = sc.nextLine().split(" ");
			sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < m; i++)
			{
				int applesItem = Integer.parseInt(applesItems[i]);
				apples[i] = applesItem;
			}

			int[] oranges = new int[n];

			String[] orangesItems = sc.nextLine().split(" ");
			sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++)
			{
				int orangesItem = Integer.parseInt(orangesItems[i]);
				oranges[i] = orangesItem;
			}

			System.out.println("S: " + s + " - T: " + t + " - A: " + a + " - B: " + b);
			countApplesAndOranges(s, t, a, b, apples, oranges);

			sc.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
