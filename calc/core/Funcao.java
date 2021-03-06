package calc.core;

/**
 * Class Funcao allows to calculate some functions like addition,
 * multiplication or average. It can be diferenciated in two types
 * (binary functions or functions for ranges of cells)
 *
 *@author Joao Ferreira
 */
 
public abstract class Funcao extends Conteudo{
	
	/**
	 * Returns the result of a function.
	 * It can be a integer or null(if some argument is wrong)
	 * 
	 * @return the result of a function
	 */
	public abstract Integer calcula();
	
	/**
	 * Returns the function in a string.
	 * 
	 * @return the function in a string.
	 */
	public abstract String toString();
}
