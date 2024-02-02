class Solution {
    public void combination(int n, int k, Set<List<Integer>> ans, List<Integer> output, int index,int start) {
        if (index > k - 1) {
            ans.add(new ArrayList<>(output));
            return;
        }
        for (int i = start; i <= n; i++) {
            output.add(i);
            combination(n, k, ans, new ArrayList<>(output), index + 1,i+1);
            output.remove(output.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        int index = 0;
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> output = new ArrayList<>();

        combination(n, k, ans, output, index,1);

        List<List<Integer>> result = new ArrayList<>(ans);
        return result;

    }
}
