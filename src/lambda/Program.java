package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));

		// Comparator é uma interface funcional (possui apenas um método abstrato)
		// Existem várias formas de fazer:

		// forma 1 - classe personalizada. o parametro do sort será uma instancia da
		// classe MyComparator que implementa a interface Comparator
		// list.sort(new MyComparator());

		// forma 2 - usando classe anonima
//		Comparator<Product> comp = new Comparator<Product>() {
//
//			@Override
//			public int compare(Product p1, Product p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//		};
//		list.sort(comp);
		
		// forma 3 - com expressão lambda (função anônima)
//		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		list.sort(comp);

		// forma 4 = + resumida
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		for (Product p : list) {
			System.out.println(p);
		}

	}
}
