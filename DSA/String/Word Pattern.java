class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[]=s.split(" ");
        Map<Character,String> store=new HashMap<>();
                Map<String,Character> store2=new HashMap<>();

        if(arr.length!=pattern.length()){
            return false;
        }

        for(int i=0;i<arr.length;i++){
            if(store.get(pattern.charAt(i))!=null && !store.get(pattern.charAt(i)).equals(arr[i])){
                return false;
            }if(store2.get(arr[i])!=null && !store2.get(arr[i]).equals(pattern.charAt(i))){
                return false;
            }
            store.put(pattern.charAt(i),arr[i]);
            store2.put(arr[i],pattern.charAt(i));

        }

        return true;
    }
}
