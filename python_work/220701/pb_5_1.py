#p.1
st = [1,2,3,4]
for i in st:
    print(i)

#p.2
print(st[-1])
print(st[-2])
print(st[-3])
print(st[-4])

#p.3
for i in range(len(st)):
    st[i]+=1
print(st)

#p.4
st=[1,2,3,4,5,6,7,8,9,10]
for i in range(len(st)):
    st[i]+=1
print(st)

#p.5
st=[1,2,3,4,5,6]
st[0],st[-1]=st[-1],st[0]
print(st)