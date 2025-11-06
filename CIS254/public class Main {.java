public class Main {
    
}public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double r = this.real + other.real;
        double i = this.imaginary + other.imaginary;
        return new ComplexNumber(r, i);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double r = this.real - other.real;
        double i = this.imaginary - other.imaginary;
        return new ComplexNumber(r, i);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double r = (this.real * other.real) - (this.imaginary * other.imaginary);
        double i = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(r, i);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denom = (other.real * other.real) + (other.imaginary * other.imaginary);
        double r = ((this.real * other.real) + (this.imaginary * other.imaginary)) / denom;
        double i = ((this.imaginary * other.real) - (this.real * other.imaginary)) / denom;
        return new ComplexNumber(r, i);
    }

    @Override
    public String toString() {
        return imaginary >= 0
            ? real + " + " + imaginary + "i"
            : real + " - " + (-imaginary) + "i";
    }

    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(4, -2);

        System.out.println("----- Complex Number Calculator -----");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("------------------------------------");

        System.out.println("Addition result: " + num1.add(num2));
        System.out.println("Subtraction result: " + num1.subtract(num2));
        System.out.println("Multiplication result: " + num1.multiply(num2));
        System.out.println("Division result: " + num1.divide(num2));
    }
}

