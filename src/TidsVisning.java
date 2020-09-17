import java.util.Scanner;

public class TidsVisning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv i sekunder: ");
        int sekunder = input.nextInt();

        TidIMinutterOgSekunder(sekunder);
    }
    public static void TidIMinutterOgSekunder(int sekunder){
        int minuter = sekunder / 60;
        int remainingSeconds = sekunder % 60;
        System.out.println(sekunder + " sekunder er " + minuter + " minuter og " + remainingSeconds + " sekunder");
    }
}
