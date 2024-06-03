package arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoArquivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		// :: method references (referências a métodos).
		// A expressão File::isDirectory é equivalente à expressão lambda (File f) ->
		// f.isDirectory().
		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}

		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}

		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
	}
}
