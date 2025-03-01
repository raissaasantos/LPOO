package JavaSyntax;

class Operadores{
	public static void main(String[] args){
		byte a = 10; 
		byte b = 3; 
		// operadores aritimeticos
		// + - * / %
		int resultado = a + b;
		System.out.println("Operando " + a);
		System.out.println("Operando " + b);
		System.out.println("Resultado " + resultado);

		// operadores aritimeticos e atribuicao
		// += -= *= /= %=
		a = 10;
		System.out.println("Operando " + a);
		a+=10; // a = a + 10;
		System.out.println("Operando com atribuicao " + a);

		// operadores incremento e decremento
		// ++ --
		a = 10;
		System.out.println("Operando " + a);
		a++;// a = a + 1;
		System.out.println("Operando incrementado " + a++);

		// operador de negacao
		// !
		boolean verdade =  true;
		System.out.println("Operando " + verdade);
		verdade = ! verdade;
		System.out.println("Operando negado " + verdade);

		// operadores de comparacao
		// > >= < <= == != 
		verdade = 1 > 5;
		System.out.println("Comparando " + verdade);

		// operadores logicos
		// && || !
		verdade = true;
		verdade = true || false;
		System.out.println("Operador OR ||");
		System.out.println("true  || true:  " + (true || true));
		System.out.println("true  || false: " + (true || false));
		System.out.println("false || true:  " + (false || true));
		System.out.println("false || false: " + (false || false));

		//operador ternario
		// teste ? valorSeTrue : valorSeTrue;
		//se o teste for true pega o 1o. senao o 2o
		char sexo = 'F';
		String sexoPorExtenso = sexo=='F'?"Feminino":"Masculino";

		/*		
			equivalente ao ternario
		if(sexo=='F'){
			sexoPorExtenso	= "Feminino";
		}else{

			sexoPorExtenso	= "Masculino";
		}
		*/
		System.out.println("Operador ternario " + sexoPorExtenso);
	}
}

































