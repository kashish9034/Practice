package trees;

import java.util.HashMap;
import java.util.Scanner;

public class Trie {
	static class TrieNode {

		HashMap<Character, TrieNode> list;
		boolean eow;
		int words_below;

		public TrieNode() {
			words_below = 0;
			this.list = new HashMap<>();
		}
	}

	static TrieNode root;
	static int count = 0;

	public static void main(String[] args) {
		TrieNode temp;
		String op = "", contact = "";
		root = new TrieNode();
		// root.init();
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		for (int i = 0; i < no; i++) {
			op = sc.next();
			contact = sc.next();
			if (op.equals("add")) {
				insertString(contact);
			}
			if (op.equals("find")) {

				temp = searchString(contact);
				if (temp == null) {
					System.out.println(0);
				} else {

					// countEow(temp);
					if(temp.eow)
					System.out.println(temp.words_below+1);
					else
						System.out.println(temp.words_below);
					// count = 0;
				}
			}
		}

		sc.close();
	}

	static void countEow(TrieNode n) {
		if (n == null)
			return;
		if (n.eow) {
			count++;
		}

		for (char c : n.list.keySet()) {
			countEow(n.list.get(c));
		}

	}

	static void insertString(String word) {
		TrieNode search = root;
		for (int i = 0; i < word.length(); i++) {
			search = searchNode(word.charAt(i), search, 1);
		}
		search.eow = true;
	}

	// returns the last node of the Trie or null if no such node exists
	static TrieNode searchString(String word) {
		TrieNode search = root;
		for (int i = 0; i < word.length(); i++) {
			search = searchNode(word.charAt(i), search);
		}
		return search;
	}

	static TrieNode searchNode(char c, TrieNode node) {
		// System.out.println("Searching for char " + c);
		if (node == null)
			return null;
		if (node.list.containsKey(c))
			return node.list.get(c);
		else
			return null;
	}

	static TrieNode searchNode(char c, TrieNode node, int insert) {
		// System.out.println("Searching & Inserting for char " + c);
		if (node.list.containsKey(c)) {
			node.words_below++;
			return node.list.get(c);
		} else {
			
			node.list.put(c, new TrieNode());
			node.words_below++;
			return node.list.get(c);
		}
	}

}
