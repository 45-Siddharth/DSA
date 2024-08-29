package DSA;
import java.util.ArrayList;
import java.util.List;

public class encodeDecode {
    class Solution {

    public String encode(List<String> strs) {
     StringBuilder res= new StringBuilder();
      for(int i=0;i<strs.size();i++)
      {
       res.append(strs.get(i)+":;");
      }
      return res.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> arr = new ArrayList<>();
        int i=0,j=0;
        while(j<str.length())
        {
            if(str.substring(j,j+2).equals(":;"))
            {
                arr.add(str.substring(i,j));
                j+=2;
                i=j;
            }
            j++;
        }
        return arr;
    }
}

}
