package Exercices;
public class CommandeEnLigne {

	public static void main(String[] args) {
		
double prixProduit = 15 ;
int quantiteCommande= 6;
double soldeClient = 300;
boolean statutClientPremium = true ;
 double prixTotal = prixProduit * quantiteCommande;
 
 if ((soldeClient >= prixTotal)&& quantiteCommande > 0 || statutClientPremium ) {
	 System.out.println("Achat accepté");
 } else {
	 System.out.println("Achat refusé");
	 
 }
 System.out.println("Le prix total " + prixTotal );
 System.out.println("solde du client " + soldeClient );
	}

}

//Cette exercice est corrigé.
