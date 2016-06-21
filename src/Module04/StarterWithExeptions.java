package module04;

class StarterWithExeptions {
    private static String error = "ERROR: Please,restart program and enter just numbers in format # or #,#:";

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        Shapes countArea = new Shapes();
        UserInput checkInput = new UserInput();
        System.out.println("Let's calculate some shapes area, and we begin with triangle." + "\n"
                            + "Enter the hight of triangle:");

        try {
            double userInput = checkInput.inputPositiveDouble();
            countArea.setTriangleHight(userInput);
            }catch(InputMismatchException ex){
                System.out.println(error);
                return;
            }
            System.out.println("now enter the lenght of the base:");

        try {
            double userInput = checkInput.inputPositiveDouble();
            countArea.setTriangleBase(userInput);
            } catch (InputMismatchException ex){
            System.out.println(error);
            return;
            }

            System.out.println("Triangle area = " +
                    countArea.countTriangleArea(countArea.getTriangleHight(), countArea.getTriangleBase())
                    + " square meters" + "\n");

            System.out.println("Well done! Now let's calculate the rectangle area." + "\n" + "enter sideA lenght:");

        try {
            double userInput = checkInput.inputPositiveDouble();
            countArea.setRectSideA(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

            System.out.println("and sideB:");

        try {
            double userInput = checkInput.inputPositiveDouble();
            countArea.setRectSideB(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

            System.out.println("Rectangle area = " +
                    countArea.countRectangleArea(countArea.getRectSideA(), countArea.getRectSideB()) +
                    " square meters" + "\n");
            System.out.println("And the last shape is a circle:" + "\n" + "enter the radius of a circle:");

        try {
            double userInput = checkInput.inputPositiveDouble();
            countArea.setRadius(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

            System.out.println("Circle area = " + countArea.countCircleArea(countArea.getRadius())
                                + " square meters" + "\n");

            Temperatures temperature = new Temperatures();
            System.out.println("Now, you can convert the temperature grades." + "\n" + "enter the Celsius grades:");

        try {
            final double userInput = sc.nextDouble();
            temperature.setCelsius(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

            System.out.println("in Fahrenheit it will be " + temperature.convertCtoF(temperature.getCelsius()));
            System.out.println("and Fahrenheit to Celsius (enter grades):");

        try {
            final double userInput = sc.nextDouble();
            temperature.setFahrenheit(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }
            System.out.println("in Celsius it will be " + temperature.convertFtoC(temperature.getFahrenheit()) + "\n");

            Distance distance = new Distance();
            System.out.println("Ok! Now you can calculate the distance between 2 points" + "\n"
                                + "Enter point A coordinate X");

        try {
            double userInput = checkInput.inputPositiveDouble();
            distance.setPointAX(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

        System.out.println("Enter point A coordinate Y");

        try {
            double userInput = checkInput.inputPositiveDouble();
            distance.setPointAY(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

        System.out.println("Enter point B coordinate X");

        try {
            double userInput = checkInput.inputPositiveDouble();
            distance.setPointBX(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

        System.out.println("Enter point B coordinate Y");

        try {
            double userInput = checkInput.inputPositiveDouble();
            distance.setPointBY(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

            System.out.println("The distance between point's A and B = "
                    + distance.countDistance(distance.getPointAX(),
                    distance.getPointAY(),
                    distance.getPointBX(),
                    distance.getPointBY()) + " meters.");

        */    System.out.println("That's all! Bye!");
    }
}