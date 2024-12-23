    package Book;
    import java.util.Scanner;

    import java.util.ArrayList;
   public class Main{

       public static ArrayList<Book>books = new ArrayList<>();


           public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
               int choix;

               while (true) {
                   System.out.println("\t Menu :\t");
                   System.out.println("1. Ajouter un livre. ");
                   System.out.println("2. Afficher les livres.");
                   System.out.println("3. Rechercher un livre.");
                   System.out.println("4. Supprimer un livre.");
                   System.out.println("5. Modifier un livre.");
                   System.out.println("6. Quitter.");
                   System.out.print("Entrez votre choix : ");

                   choix = input.nextInt();
                   input.nextLine();
                   if (choix == 6) {
                       System.out.println("Au revoir !");
                       break;
                   }

                   switch (choix) {
                       case 1:
                           ajouterUnLivre();
                           break;

                       case 2:
                           afficherunlivre();
                           break;
                       case 3:
                           rechercherunlivre();
                           break;
                       case 4:
                           supprimerunlivre();
                           break;
                       case 5:
                           modifierunlivre();
                       break;

                       default:
                           System.out.println("Choix invalide. Veuillez réessayer.");
                   }
               }
           }




       private static void ajouterUnLivre() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le titre du livre : ");
        String titre = input.nextLine();
        System.out.print("Entrez l'auteur du livre : ");
        String auteur = input.nextLine();
        System.out.print("Entrez l'ISBN du livre : ");
        String  isbn = input.nextLine();
        System.out.print("Le livre est-il disponible (true/false) ? : ");
        boolean disponible = input.nextBoolean();

        books.add(new Book(titre, auteur, isbn, disponible));
    }

    public static void afficherunlivre(){
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public static void rechercherunlivre(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ISBN pour rechercher :");
        String isbn = input.nextLine();
        boolean trouve = false;

        for(Book book:books){
            if(book.getIsbn().equals(isbn)){
                System.out.println(book);
                trouve = true;
            }

        }
        if (! trouve){
            System.out.println(" Aucun book ");
        }
    }
    public static void supprimerunlivre(){
               Scanner input=new Scanner(System.in);
        System.out.println("Entrer l'ISBN qui tu peux supprimer:");
        String isbn = input.nextLine();

        for (Book book : books ){
            if(book.getIsbn().equals(isbn)){
                books.remove(book);
                System.out.println("Le livre à été supprimé.");

                return;
            }
        }
        System.out.println("Aucun livre");
           }
           public static void modifierunlivre(){
               Scanner input = new Scanner(System.in);
               System.out.println("Entrer l'ISBN du livre à modifier:");
               String isbn = input.nextLine();
               boolean trouve= false;

               for(Book book :books){

                       System.out.println("Livre trouvé"+book);




                               System.out.println("Entrer le nouveau Titre :");
                               String nouveauTitre = input.nextLine();
                               book.setTitre(nouveauTitre);


                               System.out.println("Entrer le nouvel Auteur :");
                               String nouveauAuteur = input.nextLine();
                               book.setAuteur(nouveauAuteur);



                               System.out.println("Entrer le nouveau ISBN :");
                               String nouveauIsbn = input.nextLine();
                               book.setIsbn(nouveauIsbn);


                               System.out.println("Le livre est-il maintenant disponible (true/false)");
                               boolean nouvelledisponiblite = input.nextBoolean();
                               book.setDisponible(nouvelledisponiblite);




                               System.out.println("Choix invalide!");
                               break;
                       }
                       System.out.println("Le livre à été Modifier avec succès.");
                       trouve = true;

                   }
               }



