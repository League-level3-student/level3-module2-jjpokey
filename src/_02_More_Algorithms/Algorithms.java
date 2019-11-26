package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
for(int i = 0; i < oysters.size(); i++) {
	if(oysters.get(i) == true) {
		count++;
	}
}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		for(int a = 0; a < peeps.size(); a++) {
		for(int i = 0; i < peeps.size() - 1; i++) {
			if(peeps.get(i) > peeps.get(i + 1)) {
			 double s = peeps.get(i);
			 double s2 = peeps.get(i + 1);
			 peeps.set(i, s2);
			 peeps.set(i + 1, s);
			}
		}
		}
		return peeps.get(peeps.size() - 1);
	}

	public static String findLongestWord(List<String> words) {
		for(int a = 0; a < words.size(); a++) {
		for(int i = 0; i < words.size() - 1; i++) {
			if(words.get(i).length() > words.get(i + 1).length()) {
				String s = words.get(i);
				String s2 = words.get(i + 1);
				words.set(i, s2);
				words.set(i + 1, s);
			}
		}
		}
		return words.get(words.size() - 1);
	}

	public static boolean containsSOS(List<String> message1) {
		for(int i = 0; i < message1.size(); i++)
		if(message1.get(i).indexOf("... --- ...") != -1) {
			return true;
		}
		return false;
	}
}
