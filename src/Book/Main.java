    package Book;
    import java.util.Scanner;

    import java.util.ArrayList;
   public class Main{
       Scanner input = new Scanner(System.in);
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
        int isbn = input.nextInt();
        System.out.print("Le livre est-il disponible (true/false) ? : ");
        boolean disponible = input.nextBoolean();
        books.add(new Book(titre, auteur, isbn, disponible));
    }
    public static void afficherunlivre(){
               for (int i=0;i<books.size();i++){
                   System.out.println(books.get(i).toString());
               }
    }

    public static void rechercherunlivre(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ISBN pour rechercher :");
        int isbn = input.nextInt();
        boolean trouve = false ;

        for(Book books:books){
            if(books.getIsbn()== isbn ){
                System.out.println(books);
            }else{
                System.out.println("Aucun book.");
            }
        }
    }
    public static void supprimerunlivre(){
               Scanner input=new Scanner(System.in);
        System.out.println("Entrer l'ISBN qui tu peux supprimer:");
        int isbn = input.nextInt();
        boolean trouve = false;

        for (Book book : books ){
            if(book.getIsbn()==isbn){
                books.remove(book);
                System.out.println("Le livre à été supprimé.");
                trouve=true;
                break;
            }
        }
           }
           public static void modifierunlivre(){
               Scanner input = new Scanner(System.in);
               System.out.println("Entrer l'ISBN du livre à modifier:");
               int isbn = input.nextInt();
               boolean trouve= false;

               for(Book book :books){
                   if(book.getIsbn()==isbn){
                       System.out.println("Livre trouvé"+book);
                       System.out.println("Que voulez-vous modifier ?");
                       System.out.println("1.Modifier le Titre :");
                       System.out.println("2.Modifier L'auteur :");
                       System.out.println("3.Modifier L'ISBN :");
                       System.out.println("4.Modifier la Disponibilité :");
                       System.out.print("Entrer votre choix :");
                       int choix = input.nextInt();
                       input.nextLine();

                       switch(choix){
                           case 1 :
                               System.out.println("Entrer le nouveau Titre :");
                               String nouveauTitre = input.nextLine();
                               book.setTitre(nouveauTitre);
                               break;
                           case 2:
                               System.out.println("Entrer le nouvel Auteur :");
                               String nouveauAuteur = input.nextLine();
                               book.setAuteur(nouveauAuteur);
                               break;

                           case 3:
                               System.out.println("Entrer le nouveau ISBN :");
                               int nouveauIsbn = input.nextInt();
                               book.setIsbn(nouveauIsbn);
                               break;

                           case 4:
                               System.out.println("Le livre est-il maintenant disponible (true/false)");
                               boolean nouvelledisponiblite = input.nextBoolean();
                               book.setDisponible(nouvelledisponiblite);
                               break;

                           default:
                               System.out.println("Choix invalide!");
                               break;
                       }
                       System.out.println("Le livre à été Modifier avec succès.");
                       trouve = true;
                       break;
                   }
               }

           }
}
