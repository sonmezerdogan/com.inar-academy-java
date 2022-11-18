package chapters.chapter_06;

public class Exercise6_08 {
    public static void main(String[] args) {
        double celsius=40;
        double fahrenheit=120;
        System.out.println("Celsius     Fahrenheit   |     Fahrenheit         Celsius");

        while (celsius >= 31.0 && fahrenheit >= 30.0) {
            System.out.printf("%-12.1f%-14.1f",celsius,celsiusToFahrenheit(celsius));
            System.out.printf(" |%10.1f%15.2f",fahrenheit, fahrenheitToCelsius(fahrenheit));
            System.out.println();

            celsius-=1;
            fahrenheit-=10;
        }

    }
    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;

    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return ((5.0 / 9) * (fahrenheit-32));

    }


}
