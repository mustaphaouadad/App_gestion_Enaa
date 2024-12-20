import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Apprenant extends Personne{
    private Classe classe ;
    //private double note = new ArrayList<>();
    ArrayList<Double> note=new ArrayList<Double>();
    ArrayList<Apprenant>apprenants = new ArrayList<Apprenant>();
     ArrayList<Classe>classes=new ArrayList<Classe>();
//    public Apprenant(String nom, String prenom, String email,int id,double note) {
//        super(nom, prenom, email,id);
//        //this.classe=classe;
//        this.note = new ArrayList<>(); // Initialiser une liste vide
//        this.note.add(note);
//    }
    public Apprenant(){
        super();
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public ArrayList<Double> getNote() {
        return note;
    }

    public void setNote(ArrayList<Double> note) {
        this.note = note;
    }

    public Apprenant(int id, String nom, String prenom, String email, double note) {
        super(id, nom, prenom, email);
        this.note = new ArrayList<>(); // Initialiser une liste vide
        this.note.add(note); // Ajouter la note passée au constructeur
    }

    @Override
    public String toString() {
        return "Apprenant{" +
                "classe=" + classe +
                ", note=" + note +
                ", apprenants=" + apprenants +
                ", classes=" + classes +
                '}';
    }

    Scanner scanner=new Scanner(System.in);
    public void AjouterApprenant(){



            Apprenant apprenant = new Apprenant();
            System.out.printf("enter nom de l/'apprenant: ");
            String name = scanner.nextLine();
            apprenant.setNom(name);
            System.out.printf("enter prenom de l/'apprenant: ");
            String prenom = scanner.nextLine();
            apprenant.setPrenom(prenom);
            System.out.printf("enter email de l/'apprenant: ");
            String email = scanner.nextLine();
            apprenant.setEmail(email);
            System.out.printf("enter id de l/'apprenant: ");
            int id = scanner.nextInt();
            apprenant.setId(id);
            System.out.printf("enter note de l/'apprenant: ");
            double notes = scanner.nextDouble();
            ArrayList<Double> noteList = new ArrayList<>();
            noteList.add(notes);
            apprenant.setNote(noteList);
//            this.note.add(notes);
            scanner.nextLine();
//            System.out.println("entrer le nom de la classse: ");
//            String nomClasse = scanner.nextLine();
//            Classe classe = Recherche(nomClasse);
//            if (classe == null) {
//                System.out.println("classe n'existe pas!!");
//            }

            //(id,name,prenom,email,note);
            apprenants.add(apprenant);
//
    }
//    public Classe Recherche(String nomClass) {
//        Classe classe1=new Classe();
//        for (Classe c : classes){
//            if(classe1.getNom().equals(nomClass))return c;
//        }
//        return null;
//    }

    public void AfficherApprenant() {
        if (apprenants == null || apprenants.isEmpty()) {
            System.out.println("Aucun apprenant n'est présent dans la liste.");
        } else {
            for (Apprenant apprenant : apprenants) {
                System.out.println("id: "+apprenant.getId()+"le nom: "+apprenant.getNom()+" le prenom: "+apprenant.getPrenom()
                        +" le email: "+apprenant.getEmail()+" le note: "+apprenant.getNote());
            }
        }
    }
//    public void AfficherApprenant(){
//
//
//       System.out.println(getId());
//        System.out.println(getNom());
//        System.out.println(getPrenom());
//        System.out.println(getEmail());
//        System.out.println(getNote());
//
//    }
}
