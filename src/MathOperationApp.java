@FunctionalInterface
interface IMathFunction {
	int calculate(int a, int b);

	static void printResult(int a, int b, String function, IMathFunction fobj) {
		System.out.println("Result of " + function + " is " + fobj.calculate(a, b));
	}
}

public class MathOperationApp {

	public static void main(String[] args) {
		// Using Method Reference instead of Lambda Expression
		// This expression implements 'IMathFunction' Interface
		IMathFunction add = Integer::sum;

		// Lambda expression for multiplication & division for two parameters
		// This expression implements 'IMathFunction'
		IMathFunction multiply = (int x, int y) -> x * y;
		IMathFunction divide = (int x, int y) -> x / y;
		IMathFunction subtract = (int x, int y) -> x - y;

		System.out.println("Addition is: " + add.calculate(6, 3));
		System.out.println("Multiplication is: " + multiply.calculate(6, 3));
		System.out.println("Division is: " + divide.calculate(6, 3));
		System.out.println("Subtraction is: " + subtract.calculate(6, 3));

	}
}
