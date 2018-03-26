# Tableaux_Niveau1

## Definition
En Informatique, un tableau est une variable qui contient pluieurs valeurs.

## Decalartion

type_des_elements [] nom_variable = new type_des_elements [nombre_elements];

exemple :

```
int [] a = new int [3];
```

## Initialisation 
nom_variable [indice] = valeur;

exemple:
```
a[0] = 2;
a[1] = 6;
a[2] = 8;
```
ou 

```
int [] b = {1,2,3,4,5};
```

## Affichage
Pour des raisons de perfomrance et de consomation de memoire, les variables tableaux stock l'adresse de la case mémoire 
qui contient les valeurs du tableau.

En executant l'instruction

```
System.out.println(a);
```
ceci [I@7852e922 est affiché sur la console, ce qui représente l'adresse ou résident les valeurs du tableau.

Donc pour afficher les elements du tableau, il est necessaire d'afficher les elements une par une.

Exemple :

```
System.out.println(a[0]);
```

Pour afficher tout les elements du tableau, il suffit de developper une méthode "printTab" qui permet d'afficher tout les elements d'un tableau 
```
public static void printTab (int[][] tab)
	{
		for (int i = 0; i<tab.length;i++)
		{
			printTab(tab[i]);
	}
```
## Exemple tableau bidimentionnel
Declaration

```
int [][] tab = new int [2][2];
```
Initialisation

```
tab[0][0] = 2;
tab[0][1] = 1;
tab[1][0] = 9;
tab[1][1] = 7;
```

ou
```
int [][] tab1 = {{1,2}, {3,4}};
```

## Exercice d'application
### Exercice 1

Créez une méthode qui permet d'ajouter à tout les élèments d'un tableau d'entier un entier a.

### Exercice 2

Créez une méthode qui permet de transformer un tableau bidimentionnel (n,m) en un tableau unidimensionnel de n*m élèments.

[Solution exercices : Code Source](/tabPrjt/src/jTab/tables.java "Solution exercices")

