
/**
 * @author thomaz
 *
 */
public class Ordenacao {


	public static void main(String[] args) {


		int[] arranjo = {7,3,5,8,6,2};
//		for (int i = 0; i < 20; i++) {
//			int arranjo = (int) (Math.random()*50);
//			System.out.print(arranjo+",");
//		}
		
		quickSort(arranjo, 0, arranjo.length-1);

		for (int i = 0; i < arranjo.length; i++) {
			System.out.println(arranjo[i]);
		}

	}

	public static void quickSort(int[] arranjo, int inicio, int fim)
	{
		if (inicio < fim)
		{
			int posicaoPivo = separar(arranjo, inicio, fim);
			quickSort(arranjo, inicio, posicaoPivo - 1);
			quickSort(arranjo, posicaoPivo + 1, fim);
		}
	}

	public static int separar(int[] arranjo, int inicio, int fim)
	{
		int pivo = arranjo[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f)
		{
			if (arranjo[i] <= pivo)
				i++;
			else if (pivo < arranjo[f])
				f--;
			else
			{
				int troca = arranjo[i];
				arranjo[i] = arranjo[f];
				arranjo[f] = troca;
				i++;
				f--;
			}
		}
		arranjo[inicio] = arranjo[f];
		arranjo[f] = pivo;
		return f;
	}


	public static void mergeSort(int[] array, int inicio, int fim) {
		int meio = (inicio + fim) / 2;
		if (fim > inicio) {
			mergeSort(array, inicio, meio);
			mergeSort(array, meio + 1, fim);
		}

		int[] A = new int[meio - inicio + 1];
		int[] B = new int[fim - meio];
		for (int i = 0; i <= meio - inicio; i++) {
			A[i] = array[inicio + i];
		}
		for (int i = 0; i <= fim - meio - 1; i++) {
			B[i] = array[meio + 1 + i];
		}
		int i = 0;
		int j = 0;
		for (int k = inicio; k <= fim; k++) {
			if (i < A.length && j < B.length) {
				if (A[i] < B[j]) {
					array[k] = A[i++];
				} else {
					array[k] = B[j++];
				}
			} else if (i < A.length) {
				array[k] = A[i++];
			} else if (j < B.length) {
				array[k] = B[j++];
			}
		}
	}



	/**
	 * Bubble sort array
	 * 
	 * @param nums
	 */
	 public static void bubbleSort(int[] nums) {
		boolean mudou;
		do {
			mudou = false;
			for (int i = 0; i < nums.length-1; i++) {
				if( nums[i] > nums[i+1] ){
					int aux = nums[i+1];
					nums[i+1] = nums[i];
					nums[i] = aux;
					mudou = true;
				}
			}

		} while (mudou);
	 }

	 /**
	  * Selection sort array
	  * 
	  * @param nums
	  */
	 public static void selectionSort(int[] nums) {

		 int menor, aux;
		 for (int i = 0; i < nums.length-1; i++) {
			 menor = i;
			 for (int j = i+1; j < nums.length; j++) {
				 if( nums[menor] > nums[j] ) menor = j;
			 }
			 aux = nums[i];
			 nums[i] = nums[menor];
			 nums[menor] = aux;
		 }

	 }

	 /**
	  * Insertion sort array
	  * 
	  * @param nums
	  */
	 public static void insertionSort(int[] nums) {

		 for (int i = 1; i < nums.length; i++) {
			 int atual = nums[i];
			 int j = i-1;
			 while( (j >= 0) && ( atual < nums[j] ) ){
				 nums[j+1] = nums[j];
				 j--;
			 }
			 nums[j+1] = atual;
		 }
	 }



}













