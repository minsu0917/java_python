def int_div(a,b):
    print("몫: %d" %(a//b))
    print("나머지: %d" %(a%b))

def bet_sum(a,b):
    sum=0
    for i in range(a+1,b):
        sum+=i
    print(sum)

int_div(5,2)
bet_sum(2,5)
bet_sum(1,5)