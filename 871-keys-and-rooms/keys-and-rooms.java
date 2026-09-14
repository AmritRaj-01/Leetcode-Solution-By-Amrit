class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] isVisited=new boolean[n];
        isVisited[0]=true;
        bfs(0,rooms,isVisited);
        for(boolean ele:isVisited){
            if(ele==false) return false;
        }
        return true;
    }
    private void bfs(int start,List<List<Integer>> rooms,boolean[]isVisited){
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(q.size()>0){
            int front=q.remove();
            for(int ele:rooms.get(front)){
                if(!isVisited[ele]){
                    isVisited[ele]=true;
                    q.add(ele);
                }
            }
        }
    }
}