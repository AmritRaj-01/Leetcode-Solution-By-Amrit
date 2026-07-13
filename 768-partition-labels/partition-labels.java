// class Solution {
//     public List<Integer> partitionLabels(String s) {
//         List<Integer> partition=new ArrayList<>();
//         for(int i=0;i<s.length();){
//             int startIndex=1;
//             int endIndex=s.lastIndexOf(s.charAt(startIndex));
//             for(int j=startIndex+1;j<=endIndex-1;j++){
//                 int lastIndexOfnextChar=s.lastIndexOf(s.charAt(j));
//                 if(lastIndexOfnextChar > endIndex){
//                     endIndex=lastIndexOfnextChar;
//                 }
//             }
//             partition.add(endIndex-startIndex+1);
//             i=endIndex+1;
//         }
//         return partition;
//     }
// }

public class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }

        List<Integer> res = new ArrayList<>();
        int size = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            size++;
            end = Math.max(end, lastIndex.get(s.charAt(i)));

            if (i == end) {
                res.add(size);
                size = 0;
            }
        }
        return res;
    }
}