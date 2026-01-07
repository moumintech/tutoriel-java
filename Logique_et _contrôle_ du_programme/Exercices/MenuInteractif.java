import java.util.Scanner;
public class MenuInteractif {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Votre choix : ");
		
		int choixMenu;
		do {
			System.out.println("1 → Message de bienvenue");
			System.out.println("2 → Afficher une information");
			System.out.println("3 → Afficher une donnée fictive");
			System.out.println(" 0 → Quitter");
			
			choixMenu =sc.nextInt();
		 
			switch (choixMenu) {
			case 1:
			    System.out.println("Message de bienvenue");
			    break;
			case 2:
			    System.out.println("Afficher une information");
			    break;
			case 3:
			    System.out.println("Afficher une donnée fictive");
			    break;
			case 4:
				System.out.println("Quitter");
				break;
			default:
			    System.out.println("erreur");
			}
		} while(choixMenu!=0);
		
	sc.close(); 
	
		}
		
	}
