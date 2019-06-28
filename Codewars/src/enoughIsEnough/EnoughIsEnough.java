package enoughIsEnough;

import java.util.*;

public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i <= elements.length-1; ++i) {
			if(checkOccurences(elements[i],maxOccurrences, list)) {
				list.add(elements[i]);
			}
		}
		int[] arr = list.stream().mapToInt(i -> i).toArray();
		return arr;
	}
	
	private static boolean checkOccurences(int element, int maxOccurrences, List<Integer> list) {
		int counter = 0;
		System.out.print("Element: "+element);
		ListIterator<Integer> iter = list.listIterator();
		while(iter.hasNext()) {
			if(element == iter.next()) {
				++counter;
			}
		}
		System.out.print("\tcounter: "+counter);
		if(counter < maxOccurrences) {
			return true;
		} else {
			return false;
		}
	}
}