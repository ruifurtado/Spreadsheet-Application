package calc.core;

/**
 * Interface Argumento represents the 
 *
 *@author Joao Ferreira
 */

public interface Argumento {
	
	/**
	 * Returns the value(integer or null) of an argument.
	 * 
	 * @return the value of an argument.
	 */
	public abstract Integer getValue();
	
	/**
	 * Returns the argument in a string.
	 * 
	 * @return the argument in a string.
	 */
	public abstract String toString();
}
