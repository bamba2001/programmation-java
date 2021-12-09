package myPackage;
	import java.util.Scanner;
	 
	 public class Operation
	 {
	 @SuppressWarnings("resource")
	 	public static void main (String [] args)
		 {
			 int choix, add, mult, a, b;
			 float div;
			 div = 0;
			 b=0;
		 
			 Scanner sc = new Scanner (System.in);
			 do
			 {
				 //------------------------------------------------
				 //Effectuer un choix parmis les options du menu...
				 System.out.println ("*************************** \n");
					 System.out.println ("Voici le menu : \n");
					 System.out.println ("1. Addition \n");
					 System.out.println ("2. Multiplication \n");
					 System.out.println ("3. Division \n");
					 System.out.println ("4. Quitter \n ");
					 
					 System.out.print ("Faites un choix : \n");
					 choix = sc.nextInt();
					 //-----------------------------------------------
					 // Traitement des 4 choix...avec Switch
					 //-----------------------------------------------
					 switch ( choix )
					 {
					 case 1 :
					 System.out.println ("Entrer le premier nombre entier : \n");
					 a = sc.nextInt();
					 System.out.print ("Entrer le deuxieme nombre entier : \n");
					 b = sc.nextInt();
					 add = a + b;
					 System.out.println ("Le résultat est : "+ add);
					 break;
					 
					 case 2 :
					 System.out.println ("Entrer le premier nombre entier : \n");
					 a = sc.nextInt();
					 System.out.println ("Entrer le deuxieme nombre entier : \n");
					 b = sc.nextInt();
					 mult = a * b;
					 System.out.println ("Le résultat est : "+ mult);
					 break;
					 
					 case 3 :
					 System.out.println ("Entrer le nominateur : \n");
					 a = sc.nextInt();
					 while (b==0){
					 System.out.println ("Entrer le dénominateur(doit etre différent de 0) : \n");
					 b = sc.nextInt();
					 }
					 div = a / b;
					 System.out.println ("Le résultat est : "+ div);
					 break;
					
					 case 4 :
					 System.out.println (" Vous avez choisi de sortir...Bye!!! \n");
					 break;
					 
					 default :
					 System.out.println ("-----------------------------------");
					 System.out.println ("ERREUR!!..tappez sur 1,2,3 ou 4. \n");
					 System.out.println ("-----------------------------------");
					 break;
					 }
					 } while ( choix != 4); // Sortir du programme si le choix est 4...
					 }
	 }