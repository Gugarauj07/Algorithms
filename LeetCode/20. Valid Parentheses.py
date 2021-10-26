class Solution:
    def isValid(self, s: str) -> bool:
        replace = True
        while replace:
            start_len = len(s)
            for inner in ['{}', '()', '[]']:
                s = s.replace(inner, '')
            if start_len == len(s):
                replace = False

        return s == ''