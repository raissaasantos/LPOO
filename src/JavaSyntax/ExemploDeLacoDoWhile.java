package JavaSyntax;

class ExemploDeLacoDoWhile{

	public static void main(String[] args){
		int contador = 1;
		int contarAte = 5; // teste com 0
		do{
			System.out.println(contador++);
		}while(contador < contarAte);		
	}

}