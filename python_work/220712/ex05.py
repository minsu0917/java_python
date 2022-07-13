try:
    age = int(input('나이 입력: '))
    a = age/0
except Exception as e:
    print('무슨 에러가 났음', e)
finally:
    print('여하튼 끝')
# except ValueError:
#     print('숫자만 입력해')
# except ZeroDivisionError:
#     print('0은 못나눠')


print('종료')