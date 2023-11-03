package tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class tries {


    class Node {
        HashMap<Character, Node> children;
        boolean isWordEnd;

        Node() {
            children = new HashMap<>();
            isWordEnd = false;
        }
    }

    private Node root;

    tries() {
        root = new Node();

    }

    public void addelement(String str) {
        Node curr = root;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!curr.children.containsKey(ch)) {
                curr.children.put(ch, new Node());
            }
            curr = curr.children.get(ch);

        }
        curr.isWordEnd = true;
    }

    public boolean contains(String str) {
        Node curr = root;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!curr.children.containsKey(ch)) {
                return false;
            }
            curr = curr.children.get(ch);

        }
        return curr.isWordEnd;

    }

    ArrayList<String> traversal() {
        ArrayList<String> words = new ArrayList<>();
        traversalHelper(words, "", root);
        return words;
    }

    public void traversalHelper(ArrayList<String> words, String word, Node curr) {
        if (curr.isWordEnd) {
            words.add(word);
        }

        for (char ch : curr.children.keySet()) {
            traversalHelper(words, word + ch, curr.children.get(ch));
        }

    }

    public void populateSuffixtries(String str) {
        for (int i = 0; i < str.length(); i++) {


            insertElementsToSuffixttrie(str, i);
        }
    }

    public void insertElementsToSuffixttrie(String str, int idx) {
        Node curr = root;

        for (int i = idx; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!curr.children.containsKey(ch)) {
                curr.children.put(ch, new Node());
            }
            curr = curr.children.get(ch);

        }
        curr.isWordEnd = true;


    }

    public void deletion(String str) {
        Node curr = root;
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!curr.children.containsKey(ch)) {
                return;
            }
            stack.push(curr);
            curr = curr.children.get(ch);

        }
        curr.isWordEnd = false;

        while (!stack.isEmpty() && !root.isWordEnd && curr.children.isEmpty()) {
            Node prev = stack.pop();
            curr.children.remove(str.charAt(stack.size()));
            curr = prev;

        }


    }

    public static void main(String[] args) {
        tries obj = new tries();

        obj.addelement("helloworld");
        obj.addelement("banana");

        System.out.println(obj.contains("hello"));
        System.out.println(obj.traversal());
//        obj.populateSuffixtries("banana");
        System.out.println(obj.traversal());
        obj.deletion("banana");
        System.out.println(obj.traversal());


    }

}
