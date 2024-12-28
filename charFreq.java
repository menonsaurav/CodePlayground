/*Given string s containing only lowercase characters, the task is to print the characters along with their frequency in the order of their occurrence and in the given format explained in the examples below.

Examples: 

Input: s = “geeksforgeeks”
Output: g2 e4 k2 s2 f1 o1 r1

Input: str = “elephant”
Solve using java 
Output: e2 l1 p1 h1 a1 n1 t1 */

import java.util.*;

class charFreq {
    public static void CharacterFrequency(String str){
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        int n = str.length();
        for(int i = 0; i < n; ++i){
            char ch = str.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() + entry.getValue() + " ");
        }
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        CharacterFrequency(s1);

        // Example 2
        String s2 = "elephant";
        CharacterFrequency(s2);
    }
}
