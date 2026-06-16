class Solution {

    static HashMap<Character,Integer> makeFreq(String str){
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                int currFreq=mp.get(ch);
                mp.put(ch,currFreq+1);
            }
        }
        return mp;
    }
    public boolean isAnagram(String s, String t) {

               // 1) 1st way
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> mp1=makeFreq(s);
        HashMap<Character,Integer> mp2=makeFreq(t);
        return mp1.equals(mp2);


                    // 2) 2nd way
        // if(s.length()!=t.length()) return false;
        // HashMap<Character,Integer> mp=makeFreq(s);
        // for(int i=0;i<t.length();i++){
        //     Character ch=t.charAt(i);
        //     if(!mp.containsKey(ch)) return false;
        //     int currFreq=mp.get(ch);
        //     mp.put(ch,currFreq-1);
        // }

        // for(Integer i:mp.values()){
        //     if(i!=0) return false;
        // }
        // return true;

    }
}