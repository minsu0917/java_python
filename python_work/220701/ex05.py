a=[1,2,3,4,5]
a[0]=5
a[4]=1
print(a)

print(a[-1])
print(a[-2])
print(a[-3])
print(a[-4])
print(a[:])

a[2:5] = [0,0,0,0,0]
print(a)