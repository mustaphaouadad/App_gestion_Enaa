import java.util.ArrayList;
import java.util.Scanner;

public class Classe {
    Scanner scanner=new Scanner(System.in);
    private String nom;
    private Formateur formateur;
ArrayList<Apprenant> apprenants= new ArrayList<>();
ArrayList<Formateur>formateurs=new ArrayList<>();
ArrayList<Classe>classes=new ArrayList<>();
public Classe(String nom ,Formateur formateur, Apprenant apprenant){
    this.nom=nom;
    this.formateurs.add(formateur);
    this.apprenants.add(apprenant);
}
public  Classe(){}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public ArrayList<Apprenant> getApprenants() {
        return apprenants;
    }

    public void setApprenants(ArrayList<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }
    public void CreerClasse(){
        System.out.println("entrer le nom de la classe:");
        String nom = scanner.nextLine();
        System.out.println("entrer le formateur de la classe:");
        Formateur formateur = new Formateur();
        formateur.Ajouter();
        System.out.println("entrer un apprenant de la classe:");
        Apprenant apprenant = new Apprenant();
        apprenant.Ajouter();
        classes.add(new Classe(nom,formateur,apprenant));
    }
    public void AfficherClasse(){
    if (classes == null || classes.isEmpty()) {
        System.out.println("pas de classe creer");

    }else {
        for (Classe classe : classes) {
            System.out.println("nom: "+classe.getNom()+" le formateur: "+classe.getFormateur()+" le apprenant: "+classe.getApprenants());
        }
    }


    }
}
