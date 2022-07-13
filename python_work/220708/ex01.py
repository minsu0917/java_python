for i in range(2,10,2):
    print(i*7,end=' ')
print()

i=1
while i<100:
    i+=1
    if i%2==0 or i%3==0:
        continue
    print(i)
print()

i=2
while i<100:
    if i%2!=0 and i%3!=0:
        print(i)
    i+=1
print()

for i in range(2,10):
    for j in range(1,10):
        print(j*i,end=' ')
    print()