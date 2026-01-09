package POO.Exercices;

public class Produit {
  String nomProduit;
  double prix;
  int quantiteEnStock;
  void afficherInfos() {
    System.out.println("Produit: " + nomProduit);
    System.out.println("Prix: " + prix + " euros");
    System.out.println("Quantité en stock: " + quantiteEnStock);
  }
  void prixtotal() {
    double total = prix * quantiteEnStock;
    System.out.println("Prix total du stock: " + total + " euros");
  }
  Produit(String nomProduit, double prix, int quantiteEnStock) {
    this.nomProduit = nomProduit;
    this.prix = prix;
    this.quantiteEnStock = quantiteEnStock;
  }
  public static void main(String[] args) {
    Produit produit = new Produit("Ordinateur Portable", 799.99, 50);
    produit.afficherInfos();
    produit.prixtotal();
  }
  
}
