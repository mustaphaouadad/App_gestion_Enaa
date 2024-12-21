import java.util.ArrayList;
import java.util.Scanner;

public class Classe {
    Apprenant appre=new Apprenant();
   Formateur format=new Formateur();
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
    public void AfficherClasse() {
        if (classes == null || classes.isEmpty()) {
            System.out.println("Pas de classe créée");
        } else {
            for (Classe classe : classes) {
                System.out.println("Nom de la classe : " + classe.getNom());

                if (classe.getFormateur() != null) {
                    classe.getFormateur().Afficher();
                } else {
                    System.out.println("Aucun formateur associé à cette classe.");
                }

                if (classe.getApprenants() != null && !classe.getApprenants().isEmpty()) {
                    System.out.println("Liste des apprenants : ");
                    for (Apprenant apprenant : classe.getApprenants()) {
                        apprenant.Afficher();
                    }
                } else {
                    System.out.println("Aucun apprenant dans cette classe.");
                }
            }
        }
    }
    public void ModifierClasse(){
        System.out.println("entrer le nom de la classe a modifier:");
        String nom = scanner.nextLine();
        for (Classe classe : classes) {
            if (classe.getNom().equals(nom)) {
                System.out.println("entrer le nouveau nom de la classe:");
                String nom1 = scanner.nextLine();
                classe.setNom(nom1);
                System.out.println("entrer le nouveau formateur de la classe:");
                //Formateur formateur = new Formateur();
                format.Modifier();
                classe.setFormateur(formateur);
                System.out.println("entrer le nouveau apprenant de la classe:");
                appre.Modifier();
                classe.setApprenants(apprenants);


            }
        }
    }
    public void SupprimerClasse(){
        System.out.println("entrer le nom de classe a supprimer:");
        String nom = scanner.nextLine();
        Classe c = null;
        for (Classe classe : classes) {
            if (classe.getNom().equals(nom)) {
                c=classe;

            }}
        if (c!=null) {
            classes.remove(c);
            System.out.println("classe supprimer avec succes");
        }else
                System.out.println("erreur");
        }
    }


