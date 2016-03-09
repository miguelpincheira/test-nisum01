package cl.ubb;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	private  Calculadora calc;
	
	@Before
	public void setup() throws Exception {
		calc =new Calculadora();
	}
	
	
	
	@Test	
	public void unoMasDosEsTres() {
				
		int resultado = calc.sumar(1,2);
		
		assertEquals(3,resultado);		
				
	}
	
	@Test	
	public void menosUnoMasDosEsUno() {
		
		int resultado = calc.sumar(-1,2);
		
		assertEquals(1,resultado);
		
		
	}
	
	@Test 
	public void veinteMenosCincoEsQuince(){
		
		int resultado = calc.restar(20, 5);
		
		assertThat(resultado,is(15));
		
	}
	
	
	@Test
	public void dosMenosUnoEsUno(){
		
		
		int resultado = calc.restar(2,1);
		
		assertThat(resultado, is(1));
	}
	
	@Test	
	public void debeSumarExpresion() throws BadExpressionException{
		
		int resultado = calc.sumar("1+2+4");
		
		assertThat(resultado,is(7));
	}
	
	@Test	
	public void debeSumarExpresionConEspacios() throws BadExpressionException{
		
		int resultado = calc.sumar(" 1 + 2 + 4 ");
		
		assertThat(resultado,is(7));
	}
	
	
	@Test (expected=BadExpressionException.class)
	public void expresionVaciaArrojaExcepcion() throws BadExpressionException{ 
		
		calc.sumar("");
		
	}
	
	@Test (expected=BadExpressionException.class)
	public void expresionNulaArrojaExcepcion() throws BadExpressionException{ 
		
		calc.sumar(null);
		
	}
	
	
	@Test (expected=BadExpressionException.class)
	public void expresionSinNumeroArrojaExcepcion() throws BadExpressionException{ 
		
		calc.sumar("+");
		
	}
	
	@Test (expected=BadExpressionException.class)
	public void expresionIncorrectaArrojaExcepcion() throws BadExpressionException{ 
		
		calc.sumar("1;4+2");
		
	}

}
