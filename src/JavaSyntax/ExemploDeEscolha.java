package JavaSyntax;

class ExemploDeEscolha{

	public static void main(String[] args){
		int mes = 11;
		switch(mes){
			// case (label) ponto de entrada
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Tem 30 dias");
				break; // sai do bloco
			case 2:
				System.out.println("Tem 28 ou 29 dias");
				break;
			default: 
				System.out.println("Tem 31 dias");
				break;			
		}
	}

}