package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivo {

	public static void main(String[] args) {
		
		// O objeto file vai encapsular todo o processo de acessar o arquivo e
		// seu caminho.
		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		finally {
			// Finalizar o recurso do scanner independente do sucesso da operação
			// necessário o if pq o sc é incializado com null, se antes disso der erro
			// vai dar NPE ao tentar fechar
			if (sc != null) {
				sc.close();
			}
		}
	}
}
