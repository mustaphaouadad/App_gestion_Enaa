public class Formateur extends Personne{
    private String specialite;
    private double salaire;
    private Classe classe;
    public Formateur(String nom, String prenom, String email, int id) {
        super(nom, prenom, email,id);
        this.specialite=specialite;
        this.salaire=salaire;
        this.classe=classe;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
