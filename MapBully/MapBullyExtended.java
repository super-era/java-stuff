// Modify and return the given map as follows: if the last key has a value,
// make a new key to follow that key, give it the last key's value, and set
// the previous last key to have the value "".

import java.util.*;

public class MapBullyExtended {

    public static Map<String, String> mapBullyExtended(Map<String, String> map) {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i - 1]));
                map.put(arr[i - 1], "");
                break;
            }
        }
        return map;
    }
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<String, String>();
  
        hm.put("a", "thing1");
        hm.put("b", "thing2");
        hm.put("c", "thing3");
        hm.put("d", "thing4");

        mapBullyExtended(hm);

        for (Map.Entry<String, String> me : hm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}