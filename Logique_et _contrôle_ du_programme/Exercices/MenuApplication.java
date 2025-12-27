import java.util.Scanner;
public class MenuApplication {

	public static void main(String[] args) {



System.out.println("=== MENU ===");
System.out.println("profil    → Voir le profil");
System.out.println("modifier  → Modifier le profil");
System.out.println("supprimer → Supprimer le compte");
System.out.println("quitter   → Quitter");
System.out.println("Choisir Votre menu");

Scanner sc = new Scanner (System.in);
System.out.print("Votre choix : ");
String choixUtilisateur = sc.nextLine();

choixUtilisateur = choixUtilisateur.trim().toLowerCase();

switch (choixUtilisateur) {
case "profile":
    System.out.println("Voir le profil");
    break;
case "modifier":
    System.out.println("Modifier le profile");
    break;
case "supprimer":
    System.out.println("Supprimer le compte");
    break;
case "quitter":
	System.out.println("Quitter");
default:
    System.out.println("");
	
}sc.close();
	}

}