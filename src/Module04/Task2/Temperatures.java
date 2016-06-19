package module04.task2;

public class Temperatures {
    private static double celsius;
    private static double fahrenheit;


    public static double convertCtoF(double celsius){
        return (Math.ceil((celsius*(9.0/5.0)+32)*100)/100);
    }

    public static double convertFtoC(double fahrenheit){
        return Math.ceil(((fahrenheit-32)*(5.0/9.0))*100)/100;
    }

    public static double getCelsius() {
        return celsius;
    }

    public static void setCelsius(double celsius) {
        Temperatures.celsius = celsius;
    }

    public static double getFahrenheit() {
        return fahrenheit;
    }

    public static void setFahrenheit(double fahrenheit) {
        Temperatures.fahrenheit = fahrenheit;
    }
}

//convertCtoF(), convertFtoC() - зачем мы сначала умножаем на 100 и потом сразу делим на 100?