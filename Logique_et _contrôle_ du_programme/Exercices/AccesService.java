import java.util.Scanner;
public class AccesService {
 
	public static void main(String[] args) {
		

Scanner sc = new Scanner(System.in);
System.out.println("Entré votre age :");
int ageUtilisateur = sc.nextInt();
sc.nextLine();

System.out.print("Es-tu premium ? (oui / non) : ");
String reponse = sc.nextLine().trim().toLowerCase();


boolean estPremium;
sc.close();
if (reponse.equals("oui")) {
    estPremium = true;
} else if (reponse.equals("non")) {
    estPremium = false;
} else {
    System.out.println("Réponse invalide");
    return;
}
sc.close();
if(ageUtilisateur < 18 ) {
	System.out.println("accès refusé");
	
}else if (ageUtilisateur >= 18 && estPremium  ){
	System.out.println("accès complet");	
	
}else if(ageUtilisateur >= 18  ) {
	System.out.println("accès limité");
}else {
    System.out.println("Réponse invalide");
    return;

}
System.out.println("Votre Age :" + ageUtilisateur );
System.out.println("Votre  statut premium :" + estPremium );
System.out.println("voici  message correspondant à la situation:"  );
sc.close();
}
  

}