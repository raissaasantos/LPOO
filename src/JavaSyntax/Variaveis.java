package JavaSyntax;

class Variaveis{
	public static void main(String[] args){
		//declaracao de variavel
		// tipo identificador;
		// tipo identificador = valor;

		//tipos primitivos Java - booleano
		boolean v = true; //false 

		//tipos primitivos Java - inteiros 
		// ()cast
		byte b = (byte) 256; //    	
		System.out.println(b);
		short s = 128; //  2 bytes
		int i = 500; //   4 bytes
		long l = 5_000_000_000_000L;// 8 bytes
		
		//tipos primitivos Java - ponto flutuante
		float f = 10.0f; // 4 bytes
		double d = 10.0;//  8 bytes
	
		//tipos primitivos Java - caracter
		char letra = 'A'; // 2 bytes Unicode
		System.out.println("Declarando variaveis! " + letra);
		letra = 66;
		System.out.println("Declarando variaveis! " + letra);
		letra = '\u0043'; // '\u0BE1'
		System.out.println("Declarando variaveis! " + letra);

		//tipos complexo Java - String
		String texto = "sequencia de caracteres";
		// contrabarra e o caractere de escape do Java
		System.out.println("Declarando variaveis! \" \n\t" + texto);

	}
}














