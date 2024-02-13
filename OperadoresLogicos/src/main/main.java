package main;

public class main {

	public static void main(String[] args) {
		//Operadores Lógicos
		//and (y), or (o) y not (not)
		
		boolean resultado;
		
		resultado = 30 > 5 && true && 70 <90;
		System.out.println(resultado);
		
		resultado = false || false || false || false || true;
		System.out.println(resultado);
		
		resultado = (5 > (10*30) || true) && (true && 10 < 5);
		
		resultado = !true;
		System.out.println(resultado);
		//true = false
		//false = true
		//!
		

	}

}
