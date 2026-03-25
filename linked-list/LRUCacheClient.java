import java.util.ArrayList;
import java.util.List;

public class LRUCacheClient {
    public static void main(String[] args) {
        String[] commands = {
            "LRUCache", "put", "put", "get", "put",
            "get", "put", "get", "get", "get"
        };

        int[][] inputs = {
            {2}, {1, 1}, {2, 2}, {1}, {3, 3},
            {2}, {4, 4}, {1}, {3}, {4}
        };

        LRUCacheFinal cache = null;
        List<String> output = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            int[] input = inputs[i];

            switch (command) {
                case "LRUCache":
                    cache = new LRUCacheFinal(input[0]);
                    output.add("null");
                    break;
                case "put":
                    cache.put(input[0], input[1]);
                    output.add("null");
                    break;
                case "get":
                    output.add(String.valueOf(cache.get(input[0])));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown command: " + command);
            }
        }

        System.out.println(output);
    }
}
