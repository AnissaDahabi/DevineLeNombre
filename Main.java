import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Le but c'est qu'un joueur a 5 essais pour deviner le nombre que l'ordinateur a choisi
        //entre 0 et 30?
        //Il vous reste " + essaisRestants + "essais restants."
        Scanner scanner = new Scanner(System.in);
        Random objGenerator = new Random();

        int essaisRestants = 5;

        System.out.println("Vous avez 5 essais pour deviner le nombre choisi par l'ordinateur!");
        int nombreOrdi;
        nombreOrdi = objGenerator.nextInt(30);

        while(essaisRestants > 0){

            System.out.println("Entrez votre nombre:");
            int nombreJoueur = scanner.nextInt();

            if (nombreJoueur == nombreOrdi) {
                System.out.println("Bravo! Vous avez deviné le nombre de l'ordinateur.");
            break;

            } else if (nombreJoueur > nombreOrdi) {
                essaisRestants--;
                System.out.println("Le nombre de l'ordinateur est inférieur au votre. Il vous reste " + essaisRestants + " essais restants.");

            } else if (nombreJoueur < nombreOrdi) {
                essaisRestants--;
                System.out.println("Le nombre de l'ordinateur est supérieur au votre. Il vous reste " + essaisRestants + " essais restants.");

            } else {
                System.out.println("Veuillez indiquer un nombre entre 0 et 30.");
                //scanner.nextInt();
            }

                }
        if (essaisRestants == 0){
            System.out.println("Vous avez perdu! Le nombre choisi par l'ordinateur était: " + nombreOrdi + ".");
            }

//        System.out.println("Souhaitez-vous rejouer? (oui/non)");
//        String rejouer = scanner.nextLine().toLowerCase();
//
//        if(!rejouer.equals("oui")){
//        break;

        }

        }


     

