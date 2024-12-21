  package Book;

  public class Book {
    private String titre;
    private String auteur;
    private int  Isbn;
    private boolean disponible;


      public Book(String titre, String auteur, int isbn, boolean disponible) {
          this.titre = titre;
          this.auteur = auteur;
          this.Isbn = isbn;
          this.disponible = disponible;
      }

      public String getTitre() {
          return titre;
      }

      public void setTitre(String titre) {
          this.titre = titre;
      }

      public String getAuteur() {
          return auteur;
      }

      public void setAuteur(String auteur) {
          this.auteur = auteur;
      }

      public int getIsbn() {
          return Isbn;
      }

      public void setIsbn(int isbn) {
          Isbn = isbn;
      }

      public boolean isDisponible() {
          return disponible;
      }

      public void setDisponible(boolean disponible) {
          this.disponible = disponible;
      }

      @Override
      public String toString() {
          return "Book{" +
                  "titre='" + titre + '\'' +
                  ", auteur='" + auteur + '\'' +
                  ", Isbn=" + Isbn +
                  ", disponible=" + disponible +
                  '}';
      }
  }

