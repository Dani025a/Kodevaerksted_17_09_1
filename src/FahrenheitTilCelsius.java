import java.util.Scanner;

public class FahrenheitTilCelsius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        FahrenheitTilCelcius(fahrenheit);
    }
    public static void FahrenheitTilCelcius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " +
                celsius + " i Celsius");
    }
}
