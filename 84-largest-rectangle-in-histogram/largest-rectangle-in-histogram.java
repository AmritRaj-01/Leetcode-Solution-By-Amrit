class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer>st=new Stack<>();
        int nextSE[]=new int[n];
        int prevSE[]=new int[n];

        // nextSE next smaller element
        st.push(n-1);
        nextSE[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nextSE[i]=n;
            }
            else{
                nextSE[i]=st.peek();
            }
            st.push(i);
        }


        // empty the stack
        while(st.size()>0) st.pop();
        // prevSE previous smaller element 
        st.push(0);
        prevSE[0]=-1;
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0){
                prevSE[i]=-1;
            } 
            else{
                prevSE[i]=st.peek();
            }
            st.push(i);
        }

        int max=-1;  // initialize max with -1

        for(int i=0;i<n;i++){
            int area=heights[i]*(nextSE[i]-prevSE[i]-1);
            max=Math.max(max,area);
        }
        return max;

    }
}