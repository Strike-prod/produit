import java.util.ArrayList;
import java.util.Scanner;
public class Produit {

    private String id;
    private String nom;
    private double prix;
    private int quantite;


    public Produit( String id, String nom, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }



    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


    @Override
    public String toString() {
        return "ID : " + id +
                " | Nom : " + nom +
                " | Prix : " + prix + " FCFA" +
                " | Quantité : " + quantite;
    }

    //Methodes

    static ArrayList<Produit> produits = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void ajouterProduit(produit p) {

        Scanner clavier = new Scanner(Systeme.in);

        Systeme.System.out.println("entrer l'identifiant");
        String id = clavier.next();

        System.out.println("entrer le nom du prodiuit");
        String nom = clavier.next();
        
        System.out.println("entrer entrer le prix");
        double prix = clavier.next();

        System.out.println("entrer la quantite");
        int quantite = clavier.next;

        clavier.close();

        produits.add(p);
        System.out.println("produit" + p.getId() + "ajoute avec succes" );

    }

    public static void modifierProduit(String id, String nouveauNom, int nouvelleQuantite, double nouveauPrix ) {
       
        System.out.println("entrer lidentifiant du produit");

        for (produit p : produits ){

            if (p.getId() == id){
                p.setNom(nouveauNom);
                p.setQuantite(nouvelleQuantite);
                p.setPrix(nouveauPrix);
                System.out.println("produit ID" + id + "modifie avec succes" );
                return;
            }
        }
        System.out.println("erreur: aucun produit avec cet ID");


    }

    public static void supprimerProduit() { 
        
        System.out.println("entrer l'identiant du produit");

          for (int i = 0; i < produits.size(); i++ ){

            if (produits.getId() == id){
                String nomSupprime = produits.get(i).get.Nom();
                produits.remove(i);
                System.out.println("produit" + nom.Supprime + "supprime avec succes");
                return;
            }    
          }  
          System.out.println("erreur : aucun produit avec cet ID");
    }

    public static void afficherProduits() {

        System.out.println("entrer l'identiant du produit");
          for (produit p : produits ){
            if (p.getId() == id){
                p.afficher();
                return;
            }
        }
        System.out.println("erreur: aucun produit avec cet ID");      


    }

    public static Produit rechercherProduit(String id) {

        for (produit p : produits ){
            if (p.getId() == id){
                return p;
            }
        }
        System.out.println("erreur : aucun produit avec cet ID");  
        return null;      
    }
}