  package Book;

  public class Book {
     String titre;
     String auteur;
     String Isbn;
     boolean disponible;


      public Book(String titre, String auteur, String isbn, boolean disponible) {
          this.titre = titre;
          this.auteur = auteur;
          this.Isbn = isbn;
          this.disponible = disponible;
      }



      public void setTitre(String titre) {
          this.titre = titre;
      }



      public void setAuteur(String auteur) {
          this.auteur = auteur;
      }

      public String getIsbn() {
          return Isbn;
      }

      public void setIsbn(String isbn) {
          Isbn = isbn;
      }


      public void setDisponible(boolean disponible) {
          this.disponible = disponible;
      }

      @Override
      public String toString() {
          return "{" +
                  "Titre='" + titre + "\n" +
                  "Auteur='" + auteur + "\n" +
                  "Isbn=" + Isbn + "\n"+
                  "Disponible=" + disponible + "\n"+
      '}';
      }
  }

