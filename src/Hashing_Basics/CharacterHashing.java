package Hashing_Basics;

import java.util.Scanner;

public class CharacterHashing {
	public static void main(String[] args) {
		//lowecaseHash("abcdabcdef");
		
		UpperAndLower("aabbccZZ");

	}

	public static void lowecaseHash(String s) {
		Scanner in = new Scanner(System.in);
		int hash[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			hash[s.charAt(i) - 'a']++;
		}
		int fetch = in.nextInt();
		while (fetch-- != 0) {
			char c = in.next().charAt(0);
			System.out.println(hash[c - 'a']);

		}

	}
	
	public static void UpperAndLower(String s) {
		Scanner in = new Scanner(System.in);
		int hash[] = new int[126];
		for(int i = 0 ; i < s.length() ;  i ++) {
			hash[s.charAt(i)]++; 
		}
		
		int q = in.nextInt();
		while(q-- != 0) {
			char c = in.next().charAt(0);
			System.out.println(hash[c]);
		}
	}
}
