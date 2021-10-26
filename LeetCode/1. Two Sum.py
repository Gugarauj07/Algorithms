class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        dictionary = {}
        for i, elem in enumerate(nums):
            complement = target - elem
            if complement in dictionary:
                return [dictionary[complement], i]
            else:
                dictionary[elem] = i