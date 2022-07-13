import circle as c
import numpy as np


def main():
    r=float(input("반지름을 입력하세요: "))
    area=c.area(r)
    print(f'넓이: {area}')

    ci=c.ci_circle(r)
    print(f'둘레: {ci}')

main()

result = np.random.rand(10)
print(result)
