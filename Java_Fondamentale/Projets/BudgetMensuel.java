package Projets;
import java.util.Scanner;

public class BudgetMensuel {

	public static void main(String[] args) {
		
		/* on declare les variable et l'entrée utilisateur */
Scanner sc = new Scanner(System.in);
System.out.println("Votre revenue mensuel :");
double revenuMensuel = sc.nextDouble();
System.out.println("Vos dépenses fixes :");
double depensesFixes = sc.nextDouble();
System.out.println("Vos dépenses variables  :");
double depensesVariables = sc.nextDouble();
System.out.println("Argent minimum à garder :");
final double SEUIL_SECURITE =200;
//calcule
double totalDepenses = depensesFixes + depensesVariables;
double reste = revenuMensuel - totalDepenses;

if(revenuMensuel>= totalDepenses && reste>=  SEUIL_SECURITE) {
	System.out.println("Budget est suffisant");
	
}else {
	System.out.println("Budget insuffisant");
}
System.out.println("Votre revenu :" + revenuMensuel + "euros");
System.out.println("Total des dépenses:" + totalDepenses + "euros" );
System.out.println("Le reste :" + reste + "euros");
System.out.println("Voici votre situation");
	}

}

                    
