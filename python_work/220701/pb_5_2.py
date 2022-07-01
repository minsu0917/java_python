#p.1
st=[1,2,3,4,5]
st[1:4]=[3]
print(st)

#p.2
st=[1,2,3,4,5]
st[2:4]=[3,3.5,4]
print(st)

#p.3
st=[1,2,3,4,5]
st[1:4]=[]
print(st)

#p.4
st=[1,2,3,4,5]
st[:]=[]
print(st)

#p.5
st=[1,2,3,4,5,6,7,8,9,10]
nt=st[::2]
print(nt)

#p.6
st=[1,2,3,4,5,6,7,8,9,10]
nt=st[1::2]
print(nt)
