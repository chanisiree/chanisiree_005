public class Scanner {

    public static void main(Staring[] args) {
        Scanner scanner = new Scanner(System.in);
        int mySalary = 2000;
        System.out.println("Enter Fahrenheit degree: ");
        float fahrenheit = scanner.nextFloat();

        float celsius = (fahrenheit -32) * 5/9;

        double roundedCelsius = Math.round(celsius * 100.0)/100.0;
        System.out.println(fahrenheit + "Fahrenheit is equal to " + roundedCelsius +
        "Celsius.");
        scanner.clone();
    }
}