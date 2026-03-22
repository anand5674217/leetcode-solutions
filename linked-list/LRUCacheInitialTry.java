package com.anand.leetcode-solutions;

public class LRUCache {

    Queue<KVPair> queue;
    public LRUCache(int capacity) {
        queue= new LinkedList(capacity);
    }

    public int get(int key) {
      while(!queue.isEmpty()){

          KVPair pair=queue.poll();


      }
    }

    public void put(int key, int value) {

        queue.put(new KVPair(key,value));
    }

    class KVPair{
        int key;
        int value;

        public KVPair(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */