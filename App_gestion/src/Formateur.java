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
//getter and setter

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

    @Override
    public void Ajouter() {
        Formateur formateur = new Formateur();
        System.out.printf("enter id de l/'apprenant: ");
        int id = scanner.nextInt();
        formateur.setId(id);
        scanner.nextLine();
        System.out.printf("enter nom de l/'apprenant: ");
        String name = scanner.nextLine();
        formateur.setNom(name);
        System.out.printf("enter prenom de l/'apprenant: ");
        String prenom = scanner.nextLine();
        formateur.setPrenom(prenom);
        System.out.printf("enter email de l/'apprenant: ");
        String email = scanner.nextLine();
        formateur.setEmail(email);
        System.out.printf("enter spécialité de l/'apprenant: ");
        String specialite = scanner.nextLine();
        formateur.setSpecialite(specialite);
        System.out.printf("entrer salaire: ");
        double salaire = scanner.nextDouble();
        formateur.setSalaire(salaire);

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

    }

    @Override
    public void Supprimer() {
        System.out.println("entrer id de Formateur a supprimer: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Formateur formateur = null;
        for (Formateur formateurs : formateurs) {
            if (formateurs.getId() == id) {
                formateur = formateurs;
            }
        }
        if (formateur!=null){
            formateurs.remove(formateur);

        }else
            System.out.println("eroor");
    }

    @Override
    public void Modifier() {
        System.out.println("Entrer id de le formateur a modifier: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Formateur formateur : formateurs) {
            if (formateur.getId() == id) {
                System.out.println("entrer le nouveau nom: ");
                String nom = scanner.nextLine();
                formateur.setNom(nom);
                System.out.println("entrer le nouveau prenom: ");
                String prenom = scanner.nextLine();
                System.out.println("entrer le nouveau email: ");
                String email = scanner.nextLine();
                formateur.setEmail(email);
                System.out.printf("enter la nouveau specialite de l/'apprenant: ");
                String specialite = scanner.nextLine();
                formateur.setSpecialite(specialite);
                System.out.printf("enter la nouveau salair de l/'apprenant: ");
                double salaire = scanner.nextDouble();
                formateur.setSalaire(salaire);
            }else
                System.out.println("eroor");
        }

    }

    @Override
    public void Afficher() {
        if (formateurs == null || formateurs.isEmpty()) {
            System.out.println("Aucun apprenant n'est présent dans la liste.");
        } else {
            for (Formateur formateur : formateurs) {
                System.out.println("id: "+formateur.getId()+" le nom: "+formateur.getNom()+" le prenom: "+formateur.getPrenom()
                        +" le email: "+formateur.getEmail()+" la spécialité: "+formateur.getSpecialite()+" le salaire: "+formateur.getSalaire());
            }
        }
    }

    }




