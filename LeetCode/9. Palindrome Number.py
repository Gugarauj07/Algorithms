def isPalindrome(x: int) -> bool:
    if x < 0:
        return False
    reverse_num = contador = 0

    while x // 10**contador != 0:
        reverse_num = (reverse_num*10) + (x // 10**contador % 10)
        contador += 1

    return x == reverse_num

