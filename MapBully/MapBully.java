// Modify and return the given map as follows: if the key "a" has a value,
// set the key "b" to have that value, and set the key "a" to have the value
// "". Basically "b" is a bully, taking the value and replacing it with the 
// empty string.


// mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
// mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
// mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}

import java.util.*;

public class MapBully {

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<String, String>();
  
        hm.put("a", "thing1");
        hm.put("b", "thing2");
        hm.put("c", "thing3");
        hm.put("d", "thing4");

        mapBully(hm);

        for (Map.Entry<String, String> me : hm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}
