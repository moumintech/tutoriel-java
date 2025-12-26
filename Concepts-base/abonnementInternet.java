public class AbonnementInternet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String nomClient = " Anna ";
   int vitesseConnexion = 30;
   double prixMensuelAbonnement =24;
   boolean abonnementActif = true;
   final int DUREE = 6 ;
   System.out.println("Nom du Client :" + nomClient );
   System.out.println("La vitesse de connection : " + vitesseConnexion + "Mps" );
   System.out.println("Payment : " + prixMensuelAbonnement + " euros par mois" );
   System.out.println("Le compte est " + abonnementActif + " active." );
   System.out.println("La duree engagement est de  " + DUREE+ " mois." );
	}

}
