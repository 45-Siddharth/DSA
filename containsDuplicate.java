// problem link:
// https://neetcode.io/problems/duplicate-integer
package DSA;
import java.util.*;
class containsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set =new HashSet<Integer>();
        for(int i:nums)
        {
            if(!(set.contains(i)))
            {
                set.add(i);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
