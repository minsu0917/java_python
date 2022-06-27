def exp(num1,num2):         #3번 함수
    result = 1
    for i in range(num2):
        result *= num1
    return result

def greet():                #4번 함수
    n = int(input("인사를 몇번 할까요? "))
    for i in range(n):
        print("hello")

#1번
for i in range(5):
    print("hello")
print()

#2번
for i in range(1,10):
    print("7 x {} = {}".format(i,7*i))
print()

#3번
print(exp(2,3))
print()

#4번
greet()
