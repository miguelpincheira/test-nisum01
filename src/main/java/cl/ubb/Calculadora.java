package cl.ubb;

public class Calculadora {

	public int sumar(int numero1, int numero2) {	
		return (numero1+numero2); 
	}

	public int restar(int i, int j) {
		
		return 1;
	}

	public int sumar(String expresion) throws EmptyExpressionException  {
		
		if(expresion ==null || expresion.isEmpty())
			throw new EmptyExpressionException();
		
		String[] numbers = expresion.split("\\+");
		
		int suma = 0;
		for (String number : numbers) {
			suma = suma + Integer.valueOf(number);
		}
				
		return suma;
	}

}
