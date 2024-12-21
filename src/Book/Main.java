    package livre;
    import java.util.Scanner;

    import java.util.ArrayList;
   public class Main{
       Scanner input = new Scanner(System.in);
       public static ArrayList<Livre>books = new ArrayList<>();


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
                   System.out.println("0. Quitter.");
                   System.out.print("Entrez votre choix : ");

                   choix = input.nextInt();
                   input.nextLine();
                   if (choix == 0) {
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
        for(Book books:books){
            if(books.getIsbn().equals(isbn)){
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

           }
}
