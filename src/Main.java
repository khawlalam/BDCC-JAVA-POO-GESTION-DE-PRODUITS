import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int[] codeProduit = new int[2];
    static String[] nomsProduits = new String[2];
    static int[] quantities = new int[2];
    static double[] Prix = new double[2];
    static int currentIndex=0;

    //Ajouter Produit
    static void ajouterProduit(int code, String nom, int quantite, double prix){
                    codeProduit[currentIndex]= code;
                    nomsProduits[currentIndex ]= nom;
                    quantities[currentIndex ] = quantite;
                     Prix[currentIndex]= prix;

                 currentIndex++;
        System.out.println("Produit ajouté avec succès .... !");
    }


    //modifier

    //supprimer

    //afficher
    static void afficherProduits() {
        if(codeProduit[0]==0){
            System.out.println("Pas de produit, merci d'ajouter des nouveaux produit");
        }else{
            for (int i = 0; i < currentIndex; i++) {
                System.out.println("Code: " + codeProduit[i] +
                        "\t Nom: " + nomsProduits[i] +
                        "\t Quantité: " + quantities[i] +
                        "\t Prix: " + Prix[i]);
            }
        }

    }

    //recherche produit

    //calculer Vleur de stock

    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        int op;
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
            //aouter un produit
            case 1:
               ajouterProduit(17,"DELL",85,15777);
                ajouterProduit(13,"hp",10,19637);

                afficherProduits();
            return;

            case 2:

                return;

            case 3:

                return;
            //afficher
            case 4:
                afficherProduits();
                break;

            case 5:

                return;

            case 6:

                return;

            case 0:

                return;

        }

    }
}