package kasim27;

import java.util.ArrayList;
import java.util.List;

public class Anlamadim {

	public static void main(String[] args) {
		// verilen bir listede icinde belirli bir harf olan elemanlari silen bir program yaziniz
				List<String> list1 = new ArrayList<>();
				
				list1.add("ayse");
				list1.add("mustafa");
				list1.add("ahmet");
				list1.add("ervanaz");
				list1.add("asli");
				System.out.println(list1);
				String clean = "a";
				
				cleaner(list1,clean);

			}

			private static List<String>  cleaner(List<String> list1, String clean) {
				for (int i = 0; i < list1.size(); i++) {
					if(list1.get(i).contains(clean)) {
						list1.remove(i);
						i--;	
					}
					
					
				}
				 System.out.println(list1);
				return null;
			   	
						

	}

}
