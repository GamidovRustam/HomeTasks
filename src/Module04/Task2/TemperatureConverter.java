package Module04.Task2;

public class TemperatureConverter {
    private static double celsius;
    private static double fahrenheit;


    public double convertCtoF(double celsius){
        setCelsius(celsius);
        return (Math.ceil((celsius*(9.0/5.0)+32)*100)/100);
    }
    //тут тоже есть смысл подумать о статических методах
    public double convertFtoC(double fahrenheit){
        setFahrenheit(fahrenheit);
        return Math.ceil(((fahrenheit-32)*(5.0/9.0))*100)/100;
    }

    public static double getCelsius() {
        return celsius;
    }

    public static void setCelsius(double celsius) {
        TemperatureConverter.celsius = celsius;
    }

    public static double getFahrenheit() {
        return fahrenheit;
    }

    public static void setFahrenheit(double fahrenheit) {
        TemperatureConverter.fahrenheit = fahrenheit;
    }
}
