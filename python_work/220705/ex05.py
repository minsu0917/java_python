def main():
    num = int(input('input number: '))
    if num % 2 == 0 and num % 3 == 0:
        print(num,'은 2의 배수이면서 3의 배수입니다.')
    else:
        print(num, '은 배수가 아닙니다.')


main()
