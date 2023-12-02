import java.util.HashMap;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        //Arrays.sort(arr);
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            if(count.get(arr[i])!=null){
                count.put(arr[i],(count.get(arr[i])+1));
            }else{
                int j=1;
                count.put(arr[i],j);
            }
        }
        HashSet<Integer> s=new HashSet<>();
        for(Integer key:count.keySet()){
            s.add(count.get(key));
        }
        if(count.size()==s.size()) return true;
        return false;
    }
 }
//Create a unique "Set" such that when the count values are added, any duplicate values within the "set" are eliminated, leaving only one instance of each. This results in a reduced set size compared to a hashmap.


