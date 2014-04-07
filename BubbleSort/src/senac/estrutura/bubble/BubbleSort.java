package senac.estrutura.bubble;

public class BubbleSort {

	public static void main(String a[]) {

		int array[] = { 9, 5, 4, 6, 8, 7, 1, 3, 2 };

		System.out.print("Antes da ordenacao: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();

		int compara = 0;
		int troca = 0;
		
		int n = array.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				//System.out.println("Compara - A -1 (" + array[j - 1] + " > " + array[j]+ ") A");
				compara++;
				
				int t;
				
				if (array[j - 1] > array[j]) {
					//System.out.println("A -1: " + array[j - 1] + " A: " + array[j]);

					t = array[j - 1];

					array[j - 1] = array[j];

					array[j] = t;
				
					//System.out.println("Troca");
					troca++;

				}
			}
		}

		System.out.print("Depois da ordenacao: ");
		for (int c = 0; c < array.length; c++) {
			System.out.print(array[c] + "  ");
		}
		System.out.println();
		System.out.println("Comparacoes: "+compara+" Troca: "+troca);

	}

}