# 백준 2475번 문제
import sys

# def calc(a, b, c, d, e):
#     num1 = a ** 2
#     num2 = b ** 2
#     num3 = c ** 2
#     num4 = d ** 2
#     num5 = e ** 2
#     sum = num1 + num2 + num3 + num4 + num5
#     print(sum % 10)


# num1, num2, num3, num4, num5 = map(int, sys.stdin.readline().rstrip().split())
# calc(num1, num2, num3, num4, num5)

# -------------------------------------------------------------
# 위 코드가 제출 코드

def calc(data):
    a = list(map(lambda x : x ** 2, data))
    sum = 0
    for i in range(len(a)):
        sum += a[i]
    print(sum % 10)
    
data = list(map(int, sys.stdin.readline().rstrip().split()))
calc(data)

# lambdad함수 사용해서 풀어보기
