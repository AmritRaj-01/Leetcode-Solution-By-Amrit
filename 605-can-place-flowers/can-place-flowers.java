class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int max=0;
        int fi=-1;
        int li=-1;
        int l=flowerbed.length;
        for(int i=0;i<l;i++){
            if(flowerbed[i]==0){
                continue;
            }else if (fi==-1){
                fi=i;
                li=i;
            }else{
                li=i;
            }
        } 
        // case of all zeros
        if(fi==-1){
            max=(l+1)/2;
        }else{
            int left=fi;
            int right=l-1-li;
            max=left/2;
            max+=right/2;

            int count=0;
            for(int i=fi+1;i<=li-1;i++){
                if(flowerbed[i]==0){
                    count++;
                }else{
                    max+=(count-1)/2;
                    count=0;
                }
            }
            max+=(count-1)/2;
        }
        return n<=max;
    }
}