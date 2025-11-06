public class ComplexNumber {
    
    /** This program createss a simple java clas to represent complex numbers,
  (numbers that have a real part and an imaginary part, like 2 +3i)
 * @author:Victor Santiago
 * @since: 10/28/2025
 * 
 */

public class ComplexNumber {

    // These two variables store the parts of the complex number:
    // "real" is the normal number part, "imaginary" is the i part.
    private double real;
    private double imaginary;

    // This constructor lets us create a complex number like: new ComplexNumber(2, 3)
    // which means 2 + 3i.
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // --- Getter methods ---
    // These methods just return the values of real and imaginary.
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // --- Math operations with complex numbers ---

    // Add two complex numbers: (a + bi) + (c + di) = (a+c) + (b+d)i
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Subtract two complex numbers: (a + bi) - (c + di) = (a-c) + (b-d)i
    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Multiply two complex numbers:
    // (a + bi)(c + di) = (ac - bd) + (ad + bc)i
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    // Divide two complex numbers:
    // (a + bi) / (c + di) = [(ac + bd) / (c² + d²)] + [(bc - ad) / (c² + d²)]i
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = (other.real * other.real) + (other.imaginary * other.imaginary);
        double newReal = ((this.real * other.real) + (this.imaginary * other.imaginary)) / denominator;
        double newImaginary = ((this.imaginary * other.real) - (this.real * other.imaginary)) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    // --- toString method ---
    // This turns our complex number into a nice readable string, like "2 + 3i".
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }

    // --- Main method for testing ---
    // This is just a test program to show everything works.
    public static void main(String[] args) {
        // Let's make two complex numbers:
        ComplexNumber num1 = new ComplexNumber(2, 3);   // 2 + 3i
        ComplexNumber num2 = new ComplexNumber(1, -4);  // 1 - 4i

        // Show the numbers
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        // Show the results of operations
        System.out.println("\nAddition: " + num1.add(num2));
        System.out.println("Subtraction: " + num1.subtract(num2));
        System.out.println("Multiplication: " + num1.multiply(num2));
        System.out.println("Division: " + num1.divide(num2));
    }
}

}
