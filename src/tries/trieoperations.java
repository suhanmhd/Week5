package tries;

import java.util.ArrayList;
import java.util.HashMap;

public class trieoperations {

    class  TrieNode{
        HashMap<Character,TrieNode>children;
       boolean isWordEnd;

       TrieNode(){
          this.children = new HashMap<>();
          this.isWordEnd=false;

       }


    }

    TrieNode root;

    trieoperations(){
        this.root = new TrieNode();
    }

    public  void insertion(String str){
        TrieNode curr = root;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!curr.children.containsKey(ch)){
                curr.children.put(ch,new TrieNode());
            }
            curr=curr.children.get(ch);

        }
        curr.isWordEnd=true;
    }

    ArrayList<String> traverse() {
        ArrayList<String> words = new ArrayList<>();
        traverseHelper(root, "", words);
        return words;
    }

    void traverseHelper(TrieNode node, String word, ArrayList<String> words) {
        if(node.isWordEnd) {
            words.add(word);
        }
        for(char c : node.children.keySet()) {
            traverseHelper(node.children.get(c), word + c, words);
        }
    }

    boolean contains(String str){
        TrieNode curr =root;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!curr.children.containsKey(ch)){
                return  false;
            }
            curr=curr.children.get(ch);
        }
        return curr.isWordEnd;
    }
//    public void delete(String str) {
//        TrieNode curr = root;
//        Deque<TrieNode> stack = new ArrayDeque<>();
//        for(int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if(!curr.children.containsKey(ch)) {
//                return;
//            }
//            stack.push(curr);
//            curr = curr.children.get(ch);
//        }
//        curr.isWordEnd = false;
//        while(stack.size() > 0 && !curr.isWordEnd && curr.children.isEmpty()) {
//            TrieNode prev = stack.pop();
//            prev.children.remove(str.charAt(stack.size()));
//            curr = prev;
//        }
//    }


    public static void main(String[] args) {
        trieoperations obj = new trieoperations();
        obj.insertion("crossroads");
        obj.insertion("crossbar");
        obj.insertion("hello");
        System.out.println(obj.contains("hello"));
        System.out.println(obj.contains("hai"));
        System.out.println(obj.traverse());
    }
}
