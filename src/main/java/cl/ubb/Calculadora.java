package cl.ubb;

public class Calculadora {

	public int sumar(int numero1, int numero2) {	
		return (numero1+numero2); 
	}

	public int restar(int numero1, int numero2) {
		
		return (numero1-numero2);
	}

	public int sumar(String expresion) throws BadExpressionException  {
		
		if(expresion ==null || expresion.isEmpty())
			throw new BadExpressionException();
		
		String[] numbers = expresion.split("\\+");
		
		if (numbers.length == 0)
			throw new BadExpressionException();
		
		int suma = 0;
		for (String number : numbers) {
			try {			
				suma = suma + Integer.valueOf(number.trim());
			}catch (NumberFormatException ex){
				throw new BadExpressionException();
			}
		}
				
		return suma;
	}

}
//Para ultimo Commit