import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Création du scanner pour lire depuis le clavier
        Scanner scanner = new Scanner(System.in);
        // Declaration des variables
        int nombre1, nombre2, addition, multiplication, soustraction;
        double division;

        //Saisi du 1er nombre
        System.out.println("Saisir un premier nombre: ");
        nombre1 = scanner.nextInt(); // initialisation du nombre1

        //Saisi du 2nd nombre
        System.out.println("Saisir un second nombre: ");
        nombre2 = scanner.nextInt(); // initialisation du nombre2

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
                division = (double)nombre1 / nombre2;
                System.out.println("Résultat: "+ division);
                break;
        }

    }
}