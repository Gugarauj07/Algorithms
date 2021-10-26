def romanToInt(s: str):
    soma = 0
    pos_anterior = 'I'
    roman = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    for letra in s[::-1]:
        if roman[pos_anterior] > roman[letra]:
            soma -= roman[letra]
        else:
            soma += roman[letra]
        pos_anterior = letra
    return soma


romanToInt('MCMXCIV')