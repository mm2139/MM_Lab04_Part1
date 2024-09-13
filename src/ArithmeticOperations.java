public class ArithmeticOperations {
    public static void main(String[] args) {


        //determining operand variables
        int intOperandA = 4;
        int intOperandB = 7;

        double doubleOperandA = 4;
        double doubleOperandB = 7;

        // equations and printing of answers for operand int variables
        int intSum = intOperandA + intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;

        System.out.println("The sum, difference, product, quotient, and modulo of " + intOperandA + " and " + intOperandB + " are " + intSum + ", " + intDifference + ", " + intProduct + ", " + intQuotient + ", and " + intModulo + ".");

        // equations and printing of answers for operand double variables
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo= doubleOperandA % doubleOperandB;

        System.out.println("The sum, difference, product, quotient, and modulo of " + doubleOperandA + " and " + doubleOperandB + " are " + doubleSum+ ", " + doubleDifference + ", " + doubleProduct + ", " + doubleQuotient+ ", and " + doubleModulo + ".");

    }
}