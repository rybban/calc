package interfaces;

/**
 * 
 * @author rybba
 *
 */
public interface CalculatorBasicOperations {
	
	/**
	 * 
	 * @param number1
	 * @param number2
	 * @return
	 */
	public double equals(String total);
	public double add(double number1, double number2);
	public double subtract(double number1, double number2);
	public double divide(double number1, double number2);
	public double multiply(double number1, double number2);
	public double squareroot(double number1);
}
