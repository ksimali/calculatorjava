import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Création du scanner pour lire depuis le clavier
        Scanner scanner = new Scanner(System.in);
        // Declaration des variables
        int nombre1, nombre2;
        double addition, multiplication, soustraction, division;

        //Saisi du 1er nombre
        while(true){
            try{
                System.out.println("Saisir un premier nombre: ");
                nombre1 = scanner.nextInt(); // initialisation du nombre1 av le nombre saisi
                break; // stop the try catch if no error
            }catch(InputMismatchException e){
                System.out.println("Vous devez saisir un nombre entier!");
            }
            scanner.nextLine();// stop the while loop
        }
        //Saisi du 2nd nombre
        while(true){
            try{
                System.out.println("Saisir un second nombre: ");
                nombre2 = scanner.nextInt(); // initialisation du nombre2
                break;
            }catch(InputMismatchException e){
                System.out.println("Vous devez saisir un nombre entier!");
            }
            scanner.nextLine(); // arrête la boucle et passe a la ligne suivante
        }

        //Choix de l'opération
        System.out.println("Choisissez l'opération (+, -, *, /): ");
        char op = scanner.next().charAt(0); // recupère le caractère saisi par l'utilisateur
        String operation = String.valueOf(op); // converti le caractère en chaine de caractère

        //Traitement des opérations
        switch(operation){
            case "+" :
                addition = nombre1 + nombre2;
                System.out.println("Résultat: " + addition);
                break;
            case "-" :
                soustraction = nombre1 - nombre2;
                System.out.println("Résultat: " + soustraction);
                break;
            case "*" :
                multiplication = nombre1 * nombre2;
                System.out.println("Résultat: " + multiplication);
                break;
            case "/" :
                division = nombre1 / nombre2;
                System.out.println("Résultat: "+ division);
                break;
            default:
                System.out.println("Choix d'opération incorrecte");
                break;
        }

    }
}