package DataStrucure.HashMap;

class Node {
    int key, value;
    Node head, tail;

    Node(int k, int v) {
        this.key = k;
        this.value = v;
    }

}

public class Leetcode146 {

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
