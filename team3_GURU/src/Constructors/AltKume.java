package Constructors;

import java.util.ArrayList;
import java.util.List;

public class AltKume {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		int[] array = { -1, -2, 0, -5, 4, 3, 2, 8, 0, -2, 1 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int s : array) {
					if (s == i || s == j) {
						continue;
					}
					if (array[i] + array[j] + s == 0) {
						list.add(array[i]);
						list.add(array[j]);
						list.add(s);
						System.out.println(list);
					}
					list.clear();
				}}
				}
		
	



	
}
}
