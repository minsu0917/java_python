dc = {'새우깡': 700, '콘치즈': 850, '꼬깔콘': 750}

if '홈런볼' not in dc:
    dc['홈런볼'] = 900
print(dc)

for i in dc:
    dc[i] = dc[i] + 100
print(dc)

del dc['콘치즈']
dc['치즈콘'] = 950
print(dc)