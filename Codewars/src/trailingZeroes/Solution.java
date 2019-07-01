package trailingZeroes;

public class Solution {

	public static void main(String[] args) {
		System.out.println(zeros(6));
	}
	
	public static int zeros(int n) {
		int z = 0;
		while((n/=5) > 0) {
			z+=n;
		}
		return z;
	}
}