package generics;

import java.util.List;

public class CalculationService {

	// esse método trabalha com qualquer tipo T (list<T> desde que
	// T seja um tipo comparavel de T ou qualquer superclasse  de T desde que 
	// T estenda de comparable. Ou seja, pode ser produto ou qualquer superclasse
	// de produto
	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can´t be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
