//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int intOperandA = 1;
        int intOperandB = 5;
        int intSum ;
        int intProduct = 24;
        int intDifference = 8;
        int intQuotient = 36;
        int intModulo = 17;

        double doubleOperandA = 3.50;
        double doubleOperandB = 2.75;
        double doubleSum = 10.25;
        double doubleProduct = 15.75;
        double doubleDifference = 5.50;
        double doubleQuotient = 7.20;

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        System.out.println("The sum using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo);


        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("The sum using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using doubles of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using doubles of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient using doubles of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);

        double myLunchCost = 12.50;
        int daysInWeek = 5; // Number of days in a week
        double totalLunchCost = myLunchCost * daysInWeek;
        System.out.println("The total cost of lunch for a week is: $" + totalLunchCost);

        int numberOfKidsInFamily1 = 2;
        int numberOfKidsInFamily2 = 3;
        int numberOfKidsInFamily3 = 4;
        int totalKids = numberOfKidsInFamily1 + numberOfKidsInFamily2 + numberOfKidsInFamily3;
        System.out.println("The total number of kids in three families is: " + totalKids);

        boolean isRaining = false;
        System.out.println("Is it raining? " + (isRaining ? "Yes" : "No"));

        double gasPricePerGallon = 3.50; // Price of gas per gallon
        double gallonsFilled = 15.5; // Amount of gas filled
        double totalCost = gasPricePerGallon * gallonsFilled;
        System.out.println("The total cost of filling up the gas tank is: $" + totalCost);

        int favoriteNumber = 7; // Your favorite number
        System.out.println("Your favorite number is: " + favoriteNumber);

        double shoeSize = 9.5; // Your shoe size
        System.out.println("Your shoe size is: " + shoeSize);

        String birthMonth = "October"; // Your birth month
        System.out.println("Your birth month is: " + birthMonth);

        String fullName = "John Doe"; // Your full name
        System.out.println("Your full name is: " + fullName);


    }

}