/**
 * 
 */
package tools;

/**
 * @author fbarabasch
 *
 */
public class AyudaMemoriaJavaBasics {
	
	public static void main(String[] args) {
		primitivos();
		condicional();
		ciclo();
		arreglos();
		
	}

	public static void primitivos() {
		int x = 1;
		String f = "hola";
		System.out.println(x);
		System.out.println(f);

	}

	public static void condicional() {
		int x = 1;
		if (x == 1) {
			System.out.println("X vale 1");
		} else {
			System.out.println("vale otra cosa");
		}
	}

	public static void ciclo() {
		for (int i = 0; i < 5; ++i) {
			System.out.println(i);
		}
	}

	public static void arreglos() {
		int[] valores = new int[100];
		int[] valoresYaInicializados = { 5, 8, 15, 20 };
		valores[0] = 1444442;
		System.out.println(valores[0]);
		System.out.println(valoresYaInicializados[0]);
	}

}
