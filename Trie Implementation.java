TrieNode{
	char c;
	HashMap<Character, TrieNode> children;
	bool isLeaf;

	TrieNode(Char c) {
	this.c = c;
	}
}


public class Trie {
	
	TrieNode root;
	Trie() {
		root = new TrieNode();
	}

	public void insert(Strin word) {

		HashMap<Character, TrieNode> children = root.childre;

		for(int i = 0; i<String.length(); i++) {
			char c = word.charAt(i);
			TrieNode t;
			if(children.containsKey(c)) {
				 t = children.get(c);
				children = t.children;
			} else{

				 t = new TrieNode(c);
				children.put(c,t);
				children = t.childrren;
			}

			if(i == words.length=1) {
				t.isLeaf = true;
			}
		}
	}

	public boolean search(String word) {
		TrieNode t = SearchNode(word);
		if(t!=null && t.isLeaf ==  true) {
			return true;
		}else {
			return false;
		}
	}

	public TrieNode SearchNode(String Word) {
		HashMap<Character, TrieNode> children = root.childen
		TrieNode t = null;
		for(int i= 0; i<words.length; i++) {
			if(children.conatinsKey(c)) {
				t = childrren.get(c);
				children = t.children;
			}else{
				return null;
			}

		}
		return t;
	}

	public boolean startwith(String word) {
		treiNode t = SearchNode(word);
		if(t!= null) {
			reyurn true;
		}
		return false;
	}
}