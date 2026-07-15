import java.util.*;
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainLen=1;
        int pairEnd=pairs[0][1];
        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0]>pairEnd){
                chainLen++;
                pairEnd=pairs[i][1];
            }
        }
        return chainLen;
    }
}