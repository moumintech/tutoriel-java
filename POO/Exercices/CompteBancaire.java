package POO.Exercices;

public class CompteBancaire {
String nomTitulaire;
final int numeroCompte;
double solde;
void afficherInfos() {
    System.out.println("Titulaire: " + nomTitulaire);
    System.out.println("Numéro de compte: " + numeroCompte);
    System.out.println("Solde: " + solde + " euros");
}
void deposer(double montant) {
    if (montant > 0) {
        solde += montant;
        System.out.println(montant + " euros déposés.");
    } else {
        System.out.println("Montant de dépôt invalide.");
    }
}
void retirer(double montant) {
    if (montant > 0 && montant <= solde) {
        solde -= montant;
        System.out.println(montant + " euros retirés.");
    } else {
        System.out.println("Montant de retrait invalide ou solde insuffisant.");
    }
}
CompteBancaire(String nom, int numero, double soldeInitial) {
    nomTitulaire = nom;
    numeroCompte = numero;
    solde = soldeInitial;
}
public static void main(String[] args) {
    CompteBancaire compte = new CompteBancaire("Alice Dupont", 123456, 1000.0);
    compte.afficherInfos();
    compte.deposer(500.0);
    compte.retirer(200.0);
    compte.afficherInfos();
}
}