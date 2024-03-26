class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> store=new HashMap<>();
        for(String s:strs){
            char[] charW=s.toCharArray();
            Arrays.sort(charW);
            String shortW=new String(charW);
            if(!store.containsKey(shortW)){
                store.put(shortW,new ArrayList<>());
            }
            store.get(shortW).add(s);              
        }
        return new ArrayList<>(store.values());
    }
}
