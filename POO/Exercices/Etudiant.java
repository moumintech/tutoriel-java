package POO.Exercices;

public class Etudiant {
  String nom;
  String prenom;
  double note;
  boolean estAdmis;
  void afficherInfos() {
    System.out.println("Nom: " + nom);
    System.out.println("Prénom: " + prenom);
    System.out.println("Note: " + note);
    System.out.println("Admis: " + (estAdmis ? "Oui" : "Non"));
  }
  void evaluerAdmission() {
    estAdmis = note >= 10.0;
  }
  Etudiant(String nom, String prenom, double note) {
    this.nom = nom;
    this.prenom = prenom;
    this.note = note;
    evaluerAdmission();
  }
  public static void main(String[] args) {
    Etudiant etudiant = new Etudiant("Doe", "John", 12.5);
    etudiant.afficherInfos();
  }
}
