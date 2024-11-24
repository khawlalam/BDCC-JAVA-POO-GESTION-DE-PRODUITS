import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int maxsize=100;
    static int[] codeProduit = new int[maxsize];
    static String[] nomsProduits = new String[maxsize];
    static int[] quantities = new int[maxsize];
    static double[] prixProduits = new double[maxsize];
    static int currentIndex=0;

    //Ajouter Produit
    static void ajouterProduit(int code, String nom, int quantite, double prix){
                    codeProduit[currentIndex]= code;
                    nomsProduits[currentIndex ]= nom;
                    quantities[currentIndex ] = quantite;
                    prixProduits[currentIndex]= prix;
                              currentIndex++;
        System.out.println("Produit ajouté avec succès .... !");
    }

    //modifier
  static void modifierProduit(int code, String nouveauNom, int nouvelleQuantite, double nouveauPrix){

        for (int i = 0; i < currentIndex; i++) {
            if(code!=0 && nouveauNom!=null && nouvelleQuantite!=0 && nouveauPrix!=0){
                codeProduit[i]=code;
                nomsProduits[i]=nouveauNom;
                quantities[i]=nouvelleQuantite;
                prixProduits[i]=nouveauPrix;
                System.out.println("Update is done");
                break;
            }else {
                System.out.println("New value should not be null");
            }


          System.out.println("Code: " + codeProduit[i] +
                  "\t Nom: " + nomsProduits[i] +
                  "\t Quantité: " + quantities[i] +
                  "\t Prix: " + prixProduits[i]);
      }

  }

    //afficher
    static void afficherProduits() {
        if(codeProduit[0]==0){
            System.out.println("Pas de produit, merci d'ajouter des nouveaux produit");
        }else{
            for (int i = 0; i < currentIndex; i++) {
                System.out.println("Code: " + codeProduit[i] +
                        "\t Nom: " + nomsProduits[i] +
                        "\t Quantité: " + quantities[i] +
                        "\t Prix: " + prixProduits[i]);
            }
        }

    }

    //recherche produit
    static void rechercherProduit(String nom){
        for (int i = 0; i < currentIndex; i++) {
            if(nomsProduits[i]!=null && nomsProduits[i].equals(nom)){
                System.out.println("Code: " + codeProduit[i] +
                        "\t Nom: " + nomsProduits[i] +
                        "\t Quantité: " + quantities[i] +
                        "\t Prix: " + prixProduits[i]);
                break;
            }else{
                System.out.println("produit does not exist");

            }

        }
    }

        //supprimer
    static void supprimerProduit(int code) {
        for (int i = 0; i < currentIndex; i++) {
            if (codeProduit[i] == code) {
                codeProduit[i] = 0;
                nomsProduits[i] = null;
                quantities[i] = 0;
                prixProduits[i] = 0;
                currentIndex--;
                break;
            }

        }
    }
    //calculer Valeur de stock
        static void calculerValeurStock(){
                int some = 0;
            for(int i = 0; i < quantities.length; i++) {
                some=quantities[i]+some;
            }
            System.out.println("la some est "+some);

        }
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        int op,code,qte;
        double prix;
        String nom,nomR;
        do {
            System.out.println("------Gestion de Stock------");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Modifier un produit");
            System.out.println("3. Supprimer un produit");
            System.out.println("4. Afficher la liste des produits");
            System.out.println("5. Rechercher un produit");
            System.out.println("6. Calculer la valeur totale du stock");
            System.out.println("0. Quitter");
            System.out.println("Choisissez une option :");
            op=clavier.nextInt();
          switch (op){
                //Ajouter un produit
                case 1:
                    System.out.println("enter le code :");
                    code=clavier.nextInt();
                    System.out.println("enter le nom:");
                    nom=clavier.next();
                    System.out.println("enter la quantité :");
                    qte=clavier.nextInt();
                    System.out.println("enter le prix:");
                    prix=clavier.nextDouble();
                    ajouterProduit(code,nom,qte,prix);
                    afficherProduits();
                    break;
                case 2:
                    System.out.println("enter le code :");
                    code=clavier.nextInt();
                    System.out.println("enter le nom:");
                    nom=clavier.next();
                    System.out.println("enter la quantité :");
                    qte=clavier.nextInt();
                    System.out.println("enter le prix:");
                    prix=clavier.nextDouble();
                    modifierProduit(code,nom,qte,prix);
                    afficherProduits();

                    break;

                case 3:
                    System.out.println("enter le code :");
                    code=clavier.nextInt();
                    supprimerProduit(code);
                    break;
                //afficher
                case 4:
                    afficherProduits();
                    break;

                case 5:
                    System.out.println("enter le nom :");
                    nomR=clavier.next();
                    rechercherProduit(nomR);
                    break;

                case 6:
                    calculerValeurStock();
                    break;

                case 0:

                    break;

            }


        }while (op!=0);

    }
}