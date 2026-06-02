class Solution {
    public boolean isAnagram(String s, String t) {
        //step 1-length check
        if(s.length()!=t.length()){
            return false;
        }
        //step2-Create frequency array
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        //check all values
        for(int num: count){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
