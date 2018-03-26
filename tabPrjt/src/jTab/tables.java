package jTab;
/**
 * 
 * @author B BOUALEM
 *
 */
public class tables {
		static int m = 0;
	public static void main(String[] args) {
			// declaration d'un tableau
			int [] a= new int [5];
			// initialisation des valeaurs d'un tableau
			a[0] = 2;
			a[1] = 5;
			a[2] = 3;
			a[3] = 4;
			a[4] = 7;
			//declaration et initialisation d'un tableau
			int [] b = {1,2,3,4,5};
			
			//Affichage de l'adresse du tableau a
			System.out.println(a);
			//Affichage des elements du tableau a
			printTab(a);
			
			//Affichage de l'adresse du tableau b
			System.out.println(b);
			//Affichage des elements du tableau b
			printTab(b);
			//appel de la methode add pour additionner a et b
			//stocker le resultat dans c
			int [] c = add(a ,b);// equivalent à c= a + b
			//Affichage des elements du tableau c
			printTab(c);

			//incrementer les elements du tableau a de 2 et stocker le resultat dans a 
			increment(a, 2);// equivalent à a = a + 2

			//Affichage des elements du tableau a
			printTab(a);

			//declaration d'un tableau bidimensionnel
			int [][] tab = new int [2][2];
			//initialisation des veleurs
			tab[0][0] = 2;
			tab[0][1] = 1;
			tab[1][0] = 9;
			tab[1][1] = 7;
			//declaration et initialisation d'un tableau bidimensionnel
			int [][] tab1 = {{1,2},
							 {3,4}};
			printTab(tab1);
			//Transormer un tableau bidimensionnel en un tableau unidimentionnel/
			int[] tab2 = two2one (tab1);
			printTab(tab2);
			// Tableau tridimentionnel
			int [][][] tab3d = new int [1][2][2];
	}
	/**
	 * Methode qui permet de transformer un tableau de dimension (n, m) en un tableau de dimenson (n*m) 
	 * @param tab tableau bidimensionnel
	 * @return tableau unidimensionnel
	 */
	public static int [] two2one (int [][] tab)
	{
		int lin = tab.length;
		int col = tab[0].length;
		int index=0;
		int []result = new int [lin*col];
		for (int i =0; i< lin; i++)
		{
			for (int j=0;j<col;j++)
			{
				//index = (i*col) +j;
				result[index] = tab[i][j];
				index++;
			}
		}
		
		return result;
	}
	/**
	 * Afficher les elements d'un tableau bidimensionnel
	 * @param tab tableau bidimensionnel
	 */
	public static void printTab (int[][] tab)
	{
		for (int i = 0; i<tab.length;i++)
		{
			printTab(tab[i]);
	}
	}
	
	/**
	 * addition des elements de deux tableaux
	 * @param a tableau d'entiers
	 * @param b tableau d'entiers
	 * @return tableau d'entiers qui contient le resultat de l'addition des elements a et b
	 */
	public static int[] add(int[]a , int[] b)
	{
		int c[] = new int[a.length];
		if (a.length==b.length)
		{
			for (int i=0;i<a.length;i++ )
			{
				c[i] = a[i] + b[i];
			}
		}
		return c;
	}
	/**
	 * Afficher les elements d'un tableau unidimensionnel
	 * @param tab tableau unidimensionnel
	 */
	public static void printTab (int[] tab)
	{
		m = tab.length;
		System.out.print("[ ");
		for (int i = 0;i< m ;i++)
		{
			System.out.print(tab[i]+" ");
		}
		System.out.println("]");
	}
	/**
	 * addition des elements d'un tableau et un entier 
	 * @param tab tableau d'entiers
	 * @param b un nombre entier
	 * @return tableau d'entiers qui contient le resultat de l'addition des elements de tab et a
	 */
	public static void increment(int []tab, int a)
	{

		for (int i= 0; i< tab.length;i++)
		{
			tab[i]+=a;
		}
	}
}
