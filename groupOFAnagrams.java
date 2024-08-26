package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupOFAnagrams {
     public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<String,List<String>>();
        for(int i=0;i<strs.length;i++)
        {
            int[] alpha = new int[26];
            for(int j=0;j<strs[i].length();j++)
            {
                alpha[strs[i].charAt(j)-'a']++;
            }
            String key = Arrays.toString(alpha);
            if(!(hm.containsKey(key)))
            {
                hm.put(key,new ArrayList<String>());
            }
            hm.get(key).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}
