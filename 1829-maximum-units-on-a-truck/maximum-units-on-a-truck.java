import java.util.*;
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,Comparator.comparingDouble(o->o[1]));
        int totalUnits=0;
        for(int i=boxTypes.length-1;i>=0;i--){
            int boxCount=boxTypes[i][0];
            int unitPerBox=boxTypes[i][1];
            if(truckSize>=boxCount){
                totalUnits += boxCount*unitPerBox;
                truckSize -= boxCount;
            }else{
                totalUnits += truckSize *unitPerBox;
                break;
            }
        }
        return totalUnits;
    }
}