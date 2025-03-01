package JavaSyntax;

class ExemploDeCondicional{

	public static void main(String[] args){
		boolean imprime = true;
		if(imprime){
			System.out.println("Imprimindo");
		}


		System.out.println("\tTestando se � par");
		int numero = 10;
		boolean ePar = numero % 2 == 0;
		if(ePar){
			System.out.println("Numero " + numero + " e par");
		}else{
			System.out.println("Numero " + numero + " nao e par");
		}

		System.out.println("\tTestando se � maior que 5");

		if(numero>5){
			System.out.println("Numero " + numero + " e maior que 5");
		}else if(numero < 5){
			System.out.println("Numero " + numero + " e menor que 5");
		}else{
			System.out.println("Numero " + numero + " e igual a 5");
		}

	}

}