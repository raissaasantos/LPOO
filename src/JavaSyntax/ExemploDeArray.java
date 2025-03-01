package JavaSyntax;

class ExemploDeArray{

	public static void main(String[] args){
		int[] numeros;
		numeros = new int[3];
		System.out.println("Populando o array");
		numeros[0] = 10;
		numeros[1] = 28;
		numeros[2] = numeros[1] + 5;
		System.out.println("Imprimindo o array");
		/* Troque o i<numeros.length por i<=numeros.length
		 * para ver uma exceção
		 */
		for(int i=0;i<numeros.length;i++){
			System.out.println("numeros["+ i +"]:"+ numeros[i]);
		}


		System.out.println("for imprimindo parametros da linha de comando");
		System.out.println("Qtde de parametros: " + args.length);
		for(String arg: args){
			System.out.println(arg);
		}
		System.out.println("Fim dos parametros");
	}

}