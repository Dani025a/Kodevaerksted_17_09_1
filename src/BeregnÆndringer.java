import java.util.Scanner;

public class BeregnÆndringer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Skriv det ønskede beløb i dollars, f.eks.  11.56: ");
        double beløb = input.nextDouble();

        Beregninger(beløb);

   }
   public static void Beregninger(double beløb) {

       int resterendeBeløb = (int)(beløb * 100);
       int nummerAfEnDollar = resterendeBeløb / 100;
       resterendeBeløb = resterendeBeløb % 100;
       int nummerAfQuarters = resterendeBeløb / 25;
       resterendeBeløb = resterendeBeløb % 25;
       int nummerAfDimes = resterendeBeløb / 10;
       resterendeBeløb = resterendeBeløb % 10;
       int nummerAfNickels = resterendeBeløb / 5;
       resterendeBeløb = resterendeBeløb % 5;
       int nummerAfPennies = resterendeBeløb;
       VoresOutput(beløb, nummerAfEnDollar, nummerAfDimes, nummerAfNickels, nummerAfPennies, nummerAfQuarters);
   }

   public static void VoresOutput(double beløb, double nummerAfEnDollar, double nummerAfQuarters, double nummerAfDimes, double nummerAfNickels,double nummerAfPennies){

       System.out.println("Dit beløb er: " + beløb + " og består af");
       System.out.println("    " + nummerAfEnDollar + " dollars");
       System.out.println("    " + nummerAfQuarters + " quarters ");
       System.out.println("    " + nummerAfDimes + " dimes");
       System.out.println("    " + nummerAfNickels + " nickels");
       System.out.println("    " + nummerAfPennies + " pennies");
   }

}
