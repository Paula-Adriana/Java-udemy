package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoArquivos {
	
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Teste", "Teste1"};
		
		// Caminho do arquivo que será criado
		String path = "c:\\temp\\out.txt";
		
		// O booleano indica que não será criado novamente o arquivo, todo o processo
		// de escrita será acrescentado ao final do arquivo já existente
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
