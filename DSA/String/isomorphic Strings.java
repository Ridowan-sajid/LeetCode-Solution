class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> store =new HashMap<>();
        Map<Character, Character> store2 =new HashMap<>();

        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            if(store.get(s.charAt(i))!=null && store.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }if(store2.get(t.charAt(i))!=null && store2.get(t.charAt(i))!=s.charAt(i)){
                return false;
            }
            store.put(s.charAt(i),t.charAt(i));
            store2.put(t.charAt(i),s.charAt(i));

        }
        return true;
    }
}
