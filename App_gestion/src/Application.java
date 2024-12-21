import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            System.out.println("------------------------MENU PRINCIPAL------------------------");
            System.out.println("1 - Gérer les Apprenants  ");
            System.out.println("2 - Gérer les Formateurs  ");
            System.out.println("3 - Gérer les Classes  ");
            System.out.println("4 - Quitter  ");
            choix =sc.nextInt();
            switch (choix){
                case 1:
                    app.gererApprenant();
                    break;
                case 2:
                    app.gererFormateur();
                    break;
                case 3:
                    app.gererClasse();
                    break;
                case 4:
                    System.out.println("Quiter l'application...");
                    break;
                default:
                    System.out.println("Choix invalide ! Réssayez");
            }
        }while (choix !=4);
    }

    public  void gererApprenant(){
        Apprenant ap =new Apprenant();
        Scanner sc =new Scanner(System.in);
        int choix;
        do {
            System.out.println("-----------------GESTION DES APPRENANTS-----------------");
            System.out.println("1 - Ajouter un Apprenant");
            System.out.println("2 - Afficher tous les Apprenants");
            System.out.println("3 - Modifier un Apprenant");
            System.out.println("4 - Supprimer un Apprenant");
            System.out.println("5 - Retour au Menu Principal");
            choix= sc.nextInt();
            switch (choix){
                case 1:
                    System.out.println(" Ajouter un Apprenant ");
                    ap.Ajouter();
                    break;
                case 2:
                    System.out.println(" Afficher tous les Apprenants ");
                    ap.Afficher();
                    break;
                case 3:
                    System.out.println(" Modifier un Apprenant ");
                    ap.Modifier();
                    break;
                case 4:
                    System.out.println(" Supprimer un Apprenant ");
                    ap.Supprimer();
                    break;
                case 5:
                    System.out.println(" Retour au menu principal...");
                    break;

                default:
                    System.out.println(" Choix invalide ! Réessayez.");
            }

        }while (choix!=5);
    }
    public  void gererFormateur(){
        Formateur form =new Formateur();
        Scanner sc =new Scanner(System.in);
        int choix;
        do {
            System.out.println("-----------------GESTION DES FORMATEURS-----------------");
            System.out.println("1 - Ajouter un Formateur");
            System.out.println("2️ - Afficher tous les Formateurs");
            System.out.println("3 - Modifier un Formateur");
            System.out.println("4 - Supprimer un Formateur");
            System.out.println("5 - Retour au Menu Principal");
            choix = sc.nextInt();
            switch (choix){
                case 1:
                    System.out.println(" Ajouter un Formateur ");
                    form.Ajouter();
                    break;
                case 2:
                    System.out.println(" Afficher tous les Formateurs ");
                    form.Afficher();
                    break;
                case 3:
                    System.out.println(" Modifier un Formateur ");
                    form.Modifier();
                    break;
                case 4:
                    System.out.println(" Supprimer un Formateur ");
                    form.Supprimer();
                    break;
                case 5:
                    System.out.println(" Retour au menu principal...");
                    break;

                default:
                    System.out.println(" Choix invalide ! Réessayez.");
            }
        }while (choix !=5);
    }
    public  void gererClasse(){
        Classe cl =new Classe();
        Scanner sc=new Scanner(System.in);
        int choix;
        do {
            System.out.println("-----------------GESTION DES CLASSES-----------------");
            System.out.println("1 - Ajouter une Classe");
            System.out.println("2️ - Afficher tous les Classes");
            System.out.println("3 - Modifier une Classe");
            System.out.println("4 - Supprimer une Classe");
            System.out.println("5 - Retour au Menu Principal");
            choix = sc.nextInt();
            switch (choix){
                case 1:
                    System.out.println(" Créer une Classe  ");
                    cl.CreerClasse();
                    break;
                case 2:
                    System.out.println(" Afficher toutes les Classes");
                    cl.AfficherClasse();
                    break;
                case 3:
                    System.out.println(" Modifier une Classe ");
                    cl.ModifierClasse();
                    break;
                case 4:
                    System.out.println("  Supprimer une Classe");
                    break;
                case 5:
                    System.out.println(" Retour au menu principal...");
                    break;

                default:
                    System.out.println(" Choix invalide ! Réessayez.");
            }
        }while (choix !=5);
    }

    }

