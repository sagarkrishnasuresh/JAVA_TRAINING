package java_training.lambda;


public class LambdaExample {
    public static void main(String[] args) {
        SquareCalculator square = (number) -> number*number;

        int n= 11;

        int result = square.calculateSquare(n);

        System.out.println("The square of " + n + " is: " + result);
        
    }

}