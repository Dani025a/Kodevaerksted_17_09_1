
import java.util.Scanner;

public class BeregnLån {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Skriv årlig rente, som f.eks. 8.25: ");
        double årligRente = input.nextDouble();

        System.out.print("Skriv det ønskede låne beløb, som f.eks. 120000.95: ");
        double låneBeløb = input.nextDouble();

        System.out.print("Skriv antal år, som f.eks.  5: ");
        int antalÅr = input.nextInt();

        Beregninger(årligRente, låneBeløb, antalÅr);
    }

    public static void Beregninger(double årligRente, double låneBeløb, double antalÅr){

        double måndeligRente = årligRente / 1200;

        double månedligBetaling = låneBeløb * måndeligRente / (1 - 1 / Math.pow(1 + måndeligRente, antalÅr * 12));
        double totalBetaling = månedligBetaling * antalÅr * 12;

        System.out.println("Den månedlig betaling er DKK " +
                (int)(månedligBetaling * 100) / 100.0);
        System.out.println("Den totale betaling er DKK " +
                (int)(totalBetaling * 100) / 100.0);
    }
}
