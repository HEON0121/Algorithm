package ArraysAndStrings;

import java.util.LinkedList;

public class HashTable {
    // f(key) -> HashCode -> Index -> Value
    // 검색 시간(O(1)) 이 빠름 but 한 키에 너무 여러값이 들어가면 이렇게 O(1) -> O(n)
    // 따라서 collision(충돌)을 피하도록 알고리즘 구성하기
    class Node {
        String key;
        String value;
        public Node(String key, String value){
            this.key = key;
            this.value = value;
        }
        String value() {
            return value;
        }
        void value(String value) {
            this.value = value;
        }
    }

    LinkedList<Node>[] data;
    HashTable(int size) {
        this.data = new LinkedList[size];
    }

    int getHashCode(String key) {
        int hashcode = 0;
        for(char c : key.toCharArray()){
            hashcode += c;
        }
        return hashcode;
    }

    int convertToIndex(int hashcode) {
        return hashcode % data.length;
    }

    Node searchKey(LinkedList<Node> list, String key) {
        if (list == null) return null;
        for(Node node : list) {
            if(node.key.equals(key)) {
                return node;
            }
        }
        return null;
    }

    void put(String key, String value) {
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<Node>list = data[index];
        if(list == null) {
            list = new LinkedList<Node>();
            data[index] = list;
        }
        Node node = searchKey(list, key);
        if(node == null) {
            list.addLast(new Node(key, value));
        }else {
            node.value(value);
        }
    }

    String get(String key) {
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? "Not found" : node.value();
    }


    public static void main(String[] args) {
        HashTable h = new HashTable(3);
        h.put("a", "aa");
        h.put("b", "bb");
        h.put("c", "cc");
        System.out.println(h.get("a"));
        System.out.println(h.get("b"));
        System.out.println(h.get("c"));
        System.out.println(h.get("d"));

    }
}
