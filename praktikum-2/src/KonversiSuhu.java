import java.util.Scanner;
public class KonversiSuhu{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan satu suhu Fahrenheits: ");
        double fahrenheit = input.nextDouble();

        double celcius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Suhu Celcius: " + celcius);

        input.close();
    }
}
