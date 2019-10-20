/*

49.Leetcode
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
*/
class Solution {
    public List < List < String >> groupAnagrams(String[] strs) {
        HashMap < String, List < String >> map = new HashMap();
        
        for (String s: strs) {
            char word[] = s.toCharArray();
            //anagrams will have the same common sorted string.This will be the key of the map
            Arrays.sort(word);
            String key = new String(word);
            //assigning the word to the appropriate key
            if (!map.containsKey(key)) {
                ArrayList < String > values = new ArrayList < String > ();
                
                values.add(s);
                map.put(key, values);
            } else map.get(key).add(s);
        }
        //retuning the list of anagrams
        return new ArrayList(map.values());
    }
}
