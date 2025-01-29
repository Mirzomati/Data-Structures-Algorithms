package dsa_02_CollectionReview;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {

    public static void main(String[] args){

        //create hash map
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Jack");
        studentMap.put(2, "Berry");
        studentMap.put(3, "Alisa");

        System.out.println(findFirstNonRepeating("JJavaJ Developer"));

    }

    public static Character findFirstNonRepeating(String str){
        //space complexity O(n)
        Map<Character, Integer> map = new TreeMap<>();
        int count;
        for(Character ch: str.toCharArray()) {
            if(map.containsKey(ch)){
               count= map.get(ch);
               map.put(ch, count+1);
            }
            else map.put(ch, 1);
        }

        for(Character ch: str.toCharArray()) {
            if(map.get(ch)==1 && ch!=' ') return ch;
        }

        return null;
    }
}
