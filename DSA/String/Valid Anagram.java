class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Boolean> store=new HashMap<>();

        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String new1=new String(arr1);
        String new2=new String(arr2);

        // if(s.length()!=t.length()) return false;

        // for(int i=0;i<s.length();i++){
        //     store.put(s.charAt(i),true);
        // }
        // for(int i=0;i<t.length();i++){
        //     if(store.get(t.charAt(i))==null){
        //         return false;
        //     }
        // }
        return new1.equals(new2);
    }
}
