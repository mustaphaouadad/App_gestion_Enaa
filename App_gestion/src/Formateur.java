import java.util.ArrayList;
import java.util.Scanner;

public class Formateur extends Personne{
    Scanner scanner=new Scanner(System.in);
    private String specialite;
    private double salaire;
    private Classe classe;
    public ArrayList<Formateur>formateurs = new ArrayList<Formateur>();
    public Formateur(String nom, String prenom, String email, int id, String specialite, double salaire) {
        super(nom, prenom, email,id);
        this.specialite=specialite;
        this.salaire=salaire;
        //this.classe=classe;
    }
    public Formateur(){

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

    public void AjouterFormateur(){

        Formateur formateur = new Formateur();
        System.out.printf("enter nom de l/'apprenant: ");
        String name = scanner.nextLine();
        formateur.setNom(name);
        System.out.printf("enter prenom de l/'apprenant: ");
        String prenom = scanner.nextLine();
        formateur.setPrenom(prenom);
        System.out.printf("enter email de l/'apprenant: ");
        String email = scanner.nextLine();
        formateur.setEmail(email);
        System.out.printf("enter id de l/'apprenant: ");
        int id = scanner.nextInt();
        formateur.setId(id);
        System.out.printf("enter spécialité de l/'apprenant: ");
        String specialite = scanner.nextLine();
        System.out.println("entrer salaire: ");
        double salaire = scanner.nextDouble();

//            this.note.add(notes);
        scanner.nextLine();
//            System.out.println("entrer le nom de la classse: ");
//            String nomClasse = scanner.nextLine();
//            Classe classe = Recherche(nomClasse);
//            if (classe == null) {
//                System.out.println("classe n'existe pas!!");
//            }

        //(id,name,prenom,email,note);
        formateurs.add(formateur);
//
    }
}
