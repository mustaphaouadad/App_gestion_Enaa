public abstract class Personne {
    private int id;
    private String nom,prenom,email;
    public Personne(String nom,String prenom,String email,int id){
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.id = id;
    }
    public Personne(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Personne(int id, String nom, String prenom, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

   @Override
   public String toString() {
        return "Personne{" +
               "id=" + id +
                ", nom='" + nom + '\'' +
                ", prénom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
