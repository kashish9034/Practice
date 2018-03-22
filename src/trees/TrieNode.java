package trees;

import java.util.HashMap;

public class TrieNode {
	HashMap<Character,TrieNode> list;
	boolean eow;
	
	public TrieNode(){
		this.list = new HashMap<>();
	}
	
	void init(){
		this.list.put('k', new TrieNode());
		this.list.get('k').list.put('a', new TrieNode());
		this.list.get('k').list.get('a').list.put('s', new TrieNode());
		this.list.get('k').list.get('a').list.put('r', new TrieNode());
		this.list.get('k').list.get('a').list.get('s').list.put('h', new TrieNode());
		
	}
}
