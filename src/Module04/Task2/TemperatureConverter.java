package Module04.Task2;

public class TemperatureConverter {
    public double convertCtoF(double celsius){
        return Math.ceil((celsius*(9.0/5.0)+32)*100)/100;
    }

    public double convertFtoC(double fahrenheit){
        return Math.ceil(((fahrenheit-32)*(5.0/9.0))*100)/100;
    }
}
