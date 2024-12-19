package livre;

public class Livre {
  private String titre;
  private String auteur;
  private int isbn;
  private boolean disponible;

  public Livre(String titre, String auteur, int isbn, boolean disponible) {
    this.titre = titre;
    this.auteur = auteur;
    this.isbn = isbn;
    this.disponible = disponible;
  }

  // Getters et Setters
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
    return isbn;
  }

  public void setIsbn(int isbn) {
    this.isbn = isbn;
  }

  public boolean isDisponible() {
    return disponible;
  }

  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

  @Override
  public String toString() {
    return "Titre : " + titre + ", Auteur : " + auteur + ", ISBN : " + isbn + ", Disponible : " + disponible;
  }
}
