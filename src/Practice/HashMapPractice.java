package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("chinmay", 99);
        map.put("aman", 98);
        System.out.println(map);
       Integer v1 = map.put("chinmay", 100);
        System.out.println("Old mark of chinmay: "+v1);
        System.out.println(map);

        System.out.println("Aman mark: "+map.get("aman"));
        //System.out.println("No :"+map.get("no"));
        Integer v2= map.get("XXX");
        try{
            System.out.println(v2+1);
        }catch (NullPointerException e){
            System.out.println(e);
        }

        Integer v3= map.getOrDefault("XXX", 0);
        System.out.println("Deafult value: "+v3);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        HashMap<String, ArrayList<Integer>> map1 = new HashMap<>();
        map1.put("A", list);
        System.out.println(map1);
        map1.get("A").add(50);
        map1.get("A").add(60);
        System.out.println(map1);

//       boolean yes = map1.containsValue(list.contains(60));
        map.put("alim", 97);

        System.out.println(map);
        int old  = map.remove("alim");
        System.out.println(old+":"+map);

//        HashMap<String, Integer> map3 = new HashMap<>();
//        map3.put("c", 99);
//        map3.put("a", 98);
//        HashMap<String, Integer> map4 = map3.clone();

          for(Map.Entry<String, Integer> e: map.entrySet()){
              Integer val = e.getValue();
              String key = e.getKey();
              System.out.println(key+" has "+val);

          }
    }
}
