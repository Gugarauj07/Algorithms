class Solution:
    def search(self, nums: list[int], target: int) -> int:
        N = len(nums)
        l, r = 0, N - 1
        while l <= r:
            meio = (l + r) // 2
            if nums[meio] == target:
                return meio
            elif nums[meio] < target:
                l = meio + 1
            elif nums[meio] > target:
                r = meio - 1
        return -1
