public class Main {
    public static void main(String[] args) {

        int intOperandA = 4;
        int intOperandB = 7;
        int intSum;
        int intDifference;
        int intProduct;
        int intQuotient;
        int intModulo;

        double doubleOperandA = 4;
        double doubleOperandB = 7;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;

        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        System.out.println("The sum, difference, product, quotient, and modulo of " + intOperandA + " and " + intOperandB + " are " + intSum + ", " + intDifference + ", " + intProduct + ", " + intQuotient + ", and " + intModulo + ".");

        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo= doubleOperandA % doubleOperandB;

        System.out.println("The sum, difference, product, quotient, and modulo of " + doubleOperandA + " and " + doubleOperandB + " are " + doubleSum+", "+ doubleDifference + ", " + doubleProduct + ", " + doubleQuotient+ ", and " + doubleModulo + ".");

    }
}