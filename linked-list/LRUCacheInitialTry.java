import java.util.LinkedHashMap;

class LRUCacheInitialTry {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> map;

    public LRUCacheInitialTry(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
        if (map.size() > capacity) {
            Integer eldestKey = map.entrySet().iterator().next().getKey();
            map.remove(eldestKey);
        }
    }

    public static void main(String[] args) {
        LRUCacheInitialTry cache = new LRUCacheInitialTry(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
