//Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
//
//Write the following methods (instance methods):
//
//*Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
//*Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
//*Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
//*Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
//*Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
//*Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
//*Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
//*Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
//
//TEST EXAMPLE
//
//TEST CODE:
//
//SimpleCalculator calculator = new SimpleCalculator();
//calculator.setFirstNumber(5.0);
//calculator.setSecondNumber(4);
//System.out.println("add= " + calculator.getAdditionResult());
//System.out.println("subtract= " + calculator.getSubtractionResult());
//calculator.setFirstNumber(5.25);
//calculator.setSecondNumber(0);
//System.out.println("multiply= " + calculator.getMultiplicationResult());
//System.out.println("divide= " + calculator.getDivisionResult());
public class SimpleCalculator {
	double firstNumber;
	double secondNumber;

	public double getFirstNumber() {
		return firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getAdditionResult() {

		double result = firstNumber + secondNumber;
		return result;
	}

	public double getSubtractionResult() {

		double result = firstNumber - secondNumber;
		return result;
	}

	public double getMultiplicationResult() {

		double result = firstNumber * secondNumber;
		return result;
	}

	public double getDivisionResult() {

		double result = firstNumber / secondNumber;
		return result;
	}

}
