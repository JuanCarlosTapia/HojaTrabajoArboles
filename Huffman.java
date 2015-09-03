public class Huffman {
	
	private String MensajeFrequencias;
	
	
	
	public Huffman(String mensajeFrequencias) {
		MensajeFrequencias = mensajeFrequencias;
	}



	public void frequencias(){
		String[] letras = "abcdefghijklmnopqrstuvwxyz".split("");
		String[] MensajePartido = MensajeFrequencias.split("");
		int contador = 0;
		for (int i=0; i<letras.length; i++){
			for (int j=0; j<MensajePartido.length; j++){
				
				if(letras[i].equals(MensajePartido[j])){
					contador++;
					
				}	
			}
			if (contador!=0){
				System.out.println(letras[i] +"  " +contador);
			}
			contador = 0;
		}
	}
}
