def searchInsert(nums: list[int], target: int) -> int:

    l, r = 0, len(nums) - 1
    while l <= r:
        meio = (l + r) // 2
        if nums[meio] == target:
            return meio
        elif nums[meio] < target:
            l = meio + 1
        elif nums[meio] > target:
            r = meio - 1
    nums.append(target)
    nums.sort()
    return nums.index(target)