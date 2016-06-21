package module04.task2;

public class Temperatures {
    public static double convertCtoF(double celsius){
    //for round return statement to have 2 digits after a point: it's multiplied on 100, rounds and then divided on 100
        return (Math.ceil((celsius*(9.0/5.0)+32)*100))/100;
    }

    public static double convertFtoC(double fahrenheit){
        return (Math.ceil(((fahrenheit-32)*(5.0/9.0))*100))/100;
    }
}

//convertCtoF(), convertFtoC() - зачем мы сначала умножаем на 100 и потом сразу делим на 100?