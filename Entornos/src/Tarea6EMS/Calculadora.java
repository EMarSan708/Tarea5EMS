/**
 * 
 */
package Tarea6EMS;

/**
 * Esta clase contiene métodos típicos de una calculadora básica
 * @author Juan Simón
 *
 */


public class Calculadora {
	/**
	* Método constructor por defecto
	*/
	public Calculadora(){
        
    }
	/**
	* Método que suma dos números enteros
	* @param num1 Primer número
	* @param num2 Segundo número
	* @return la suma de los parametros de entrada
	*/
    public int suma(int num1,int num2){
        return num1+num2;
        
    }
    /**
	* Método que resta dos números enteros
	* @param num1 Primer número
	* @param num2 Segundo número
	* @return la resta del num1 menos el num2
	*/
    public int resta(int num1,int num2){
        return num1-num2;
    }
    /**
	* Método que multiplica dos números enteros
	* @param num1 Primer número
	* @param num2 Segundo número
	* @return la multiplicación de los parametros de entrada
	*/
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    /**
	* Método que divide dos números enteros
	* @param num1 Primer número
	* @param num2 Segundo número
	* @return la division del primer número entre el segundo
	*/
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }

	private int valor1;
	private int valor2;
}
