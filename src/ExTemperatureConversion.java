import java.sql.SQLOutput;
import java.util.Scanner;

public class ExTemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em Graus Farenheit");
        double farenheitDegree = Double.parseDouble(sc.nextLine());

        TemperatureConverter(farenheitDegree);
    }

    public static void TemperatureConverter(double degreeToConvert){
        double convertedToCelsius = 0.0;

        convertedToCelsius = (degreeToConvert - 32) / 9 * 5;

        System.out.println("A Temperatura em Farenheit informada foi: " + degreeToConvert);
        System.out.println("A Temperatura em Celsius após a conversão é: " + convertedToCelsius);
    }


}
