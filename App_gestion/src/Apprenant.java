import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant extends Personne{
    private Classe classe ;
   // private ArrayList<Double> note ;
    ArrayList<Double> note=new ArrayList<Double>();
    ArrayList<Apprenant>apprenants = new ArrayList<Apprenant>();
     ArrayList<Classe>classes=new ArrayList<Classe>();
    public Apprenant(String nom, String prenom, String email,int id) {
        super(nom, prenom, email,id);
        this.classe=classe;
//        this.note=note;
    }
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

    public Apprenant(int id, String nom, String prenom, String email, ArrayList<Double> note) {
        super(id, nom, prenom, email);
        this.note = note;
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
        apprenant.setNote(note);
        note.add(notes);
        scanner.nextLine();
        System.out.println("entrer le nom de la classse: ");
        String nomClasse = scanner.nextLine();
        Classe classe = Recherche(nomClasse);
        if(classe==null){
            System.out.println("classe n'existe pas!!");
        }

        //(id,name,prenom,email,note);
        apprenants.add(apprenant);
    }
    public Classe Recherche(String nomClass) {
        Classe classe1=new Classe();
        for (Classe c : classes){
            if(classe1.getNom().equals(nomClass))return c;
        }
        return null;
    }

    public void AfficherApprenat() {
        if (apprenants.isEmpty()) {
            System.out.println("Aucun apprenant n'est présent dans la liste.");
        } else {
            int i;
;
            for (int i = 0; i< apprenants.size();i++){
//
                System.out.println((i + 1) + ". " + apprenants.get(i));
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
