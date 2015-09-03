import java.util.Scanner;

public class IngresoHuffman {
	public static void main (String[] args) {  
		Scanner teclado = new Scanner (System.in);
		String PrimerIngreso = teclado.nextLine();
		Huffman huffman = new Huffman(PrimerIngreso);
		
	
	}  
}
