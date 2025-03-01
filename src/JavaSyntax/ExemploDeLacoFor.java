package JavaSyntax;

class ExemploDeLacoFor{

	public static void main(String[] args){

		System.out.println("for contador");
		int inicio = 1;
		int fim = 10;		
		for(int contador = inicio;contador<=fim;contador++){
			System.out.println(contador);
		}

                //          i 0 1 2 3 4
		System.out.println("for controlanndo indice de array");
		int[] nums = {2,4,6,8,10};
		for(int i=0; i<nums.length ;i++){
			System.out.println("nums["+i+"]:" + nums[i]);
		}

		System.out.println("enhanced for / for each");
		System.out.println("Para cada");
		for(int num: nums){
			System.out.println(num);
		}

	}

}