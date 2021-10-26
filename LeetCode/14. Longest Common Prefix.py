class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:

        if len(strs) == 0:
            return ''

        prefix = strs[0]
        prefix_len = len(prefix)

        for word in strs[1:]:
            while prefix != word[:prefix_len]:
                prefix = prefix[:(prefix_len-1)]
                prefix_len -= 1

                if prefix_len == 0:
                    return ''
        return prefix