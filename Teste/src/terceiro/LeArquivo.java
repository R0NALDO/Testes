package terceiro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeArquivo {
	//le arquivo e mostra só algumas linhas
	public static void main(String[] args) throws IOException {
	
		String caminho = "C:/Users/Ronaldo/Desktop/controle.csv";
		caminho = caminho.replace("/","\\");
		FileReader arquivoLido = new FileReader(caminho); 			// objeto que carrega o arquivo na ram
		BufferedReader leitor = new BufferedReader(arquivoLido); 	//objeto que manipula o arquivo
		String linha = leitor.readLine(); 							//lê a primeia linha do arquivo
		String[] vetor = new String[3];
			
			while (linha != null ) {
				linha = linha.replace(",", " ");
				if (!linha.contains("ey")) {
					vetor = linha.split("\n");
					for (String palavra : vetor) {
						System.out.println(" " + palavra);
					}
				}
				linha = leitor.readLine();
		}
	}
}
