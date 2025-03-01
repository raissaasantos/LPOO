package JavaSyntax;

class ExemploDeLacoWhile{

	public static void main(String[] args){
		int contador = 0;
		int contarAte = 10;
		while(contador < contarAte){
			//pre incremento, teste por contador++
			System.out.println(++contador);
		}
	}

}