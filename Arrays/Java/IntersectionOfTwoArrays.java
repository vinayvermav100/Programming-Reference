package Lect7;

import java.util.ArrayList;

public class Intersectionoftwoarrays {

	public static void main(String[] args) {
		int[] one = { 10, 10, 20, 20, 30, 40, 40, 40 };
		int[] two = { 10, 20, 20, 20, 30, 30, 40, 60, 70 };
		System.out.println(intersection(one, two));
	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<>();
		int i = 0;
		int j = 0;
		int a = one.length;
		int b = two.length;
		while (i < a && j < b) {
			if (one[i] < two[j])
				i++;
			else if (one[i] > two[j])
				j++;
			else {
				ans.add(one[i]);
				i++;
				j++;
			}

		}
		return ans;
	}
}
