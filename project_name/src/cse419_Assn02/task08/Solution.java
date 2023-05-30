class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        result.add(new ArrayList<>()); 
        subsets(0, nums, numList, result);
        return result;
    }

    private void subsets(int offset, int[] nums, List<Integer> numList, List<List<Integer>>result) {
        if (offset >= nums.length) {
            return;
        }
        int val = nums[offset];
        numList.add(val);
        subsets(offset + 1, nums, numList, result);
        result.add(new ArrayList<>(numList));
        numList.remove(numList.size() - 1);
        subsets(offset + 1, nums, numList, result);
    }
}class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        result.add(new ArrayList<>()); 
        subsets(0, nums, numList, result);
        return result;
    }

    private void subsets(int offset, int[] nums, List<Integer> numList, List<List<Integer>>result) {
        if (offset >= nums.length) {
            return;
        }
        int val = nums[offset];
        numList.add(val);
        subsets(offset + 1, nums, numList, result);
        result.add(new ArrayList<>(numList));
        numList.remove(numList.size() - 1);
        subsets(offset + 1, nums, numList, result);
    }
}