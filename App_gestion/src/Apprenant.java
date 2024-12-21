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
    @Override
    public void Ajouter(){
        Apprenant apprenant = new Apprenant();
        System.out.printf("enter id de l/'apprenant: ");
        int id = scanner.nextInt();
        apprenant.setId(id);
        scanner.nextLine();
            System.out.printf("enter nom de l/'apprenant: ");
            String name = scanner.nextLine();
            apprenant.setNom(name);
            System.out.printf("enter prenom de l/'apprenant: ");
            String prenom = scanner.nextLine();
            apprenant.setPrenom(prenom);
            System.out.printf("enter email de l/'apprenant: ");
            String email = scanner.nextLine();
            apprenant.setEmail(email);

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
        System.out.println("apprenant ajouter avec succes");
//
    }

    @Override
    public void Supprimer() {
        System.out.println("entrer id de l/'apprenant a supprimer: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Apprenant app = null;
        for (Apprenant apprenant : apprenants) {
            if (apprenant.getId() == id) {
               app=apprenant;
            }
        }
        if (app!=null){
            apprenants.remove(app);
            System.out.println("apprenant supprimer avec succes");
        }else
            System.out.println("eroor");
    }



    @Override
    public void Modifier() {
        System.out.println("entrer id de l/'apprenant a modifier: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Apprenant apprenant : apprenants) {
            if (apprenant.getId() == id) {
                System.out.println("entrer le nouveau nom: ");
                String nom = scanner.nextLine();
                apprenant.setNom(nom);
                System.out.println("entrer le nouveau prenom: ");
                String prenom = scanner.nextLine();
                apprenant.setPrenom(prenom);
                System.out.println("entrer le nouveau email: ");
                String email = scanner.nextLine();
                apprenant.setEmail(email);
                System.out.printf("enter la nouveau note de l/'apprenant: ");
                double notes = scanner.nextDouble();
                ArrayList<Double> noteList = new ArrayList<>();
                noteList.add(notes);
                apprenant.setNote(noteList);
                System.out.println("apprenant modifier avec succes");
            }else
                System.out.println("eroor");

        }



    }

//    public Classe Recherche(String nomClass) {
//        Classe classe1=new Classe();
//        for (Classe c : classes){
//            if(classe1.getNom().equals(nomClass))return c;
//        }
//        return null;
//    }
@Override
    public void Afficher() {
        if (apprenants == null || apprenants.isEmpty()) {
            System.out.println("Aucun apprenant n'est présent dans la liste.");
        } else {
            for (Apprenant apprenant : apprenants) {
                System.out.println("id: "+apprenant.getId()+" le nom: "+apprenant.getNom()+" le prenom: "+apprenant.getPrenom()
                        +" le email: "+apprenant.getEmail()+" le note: "+apprenant.getNote());
            }
        }
    }


}
