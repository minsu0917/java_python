# from select import select
# from car import Car

# c1 = car

# select= int(input('1. 속도입력\n2. 속도출력'))
# if select==1:
#     c1.set_speed(int(input('속도 설정: ')))

# else:
#     print('현재 속도:',c1.get_speed())

from car import Car

def main():
    c1 = Car()
    print('main')

    while True:
        print('1. 속도입력: ')
        print('2. 속도출력: ')
        select = input()
        if select =='1':
            c1.speed =input('속도를 입력하세요: ')
        else:
            print('속도 =',c1.speed)
main()