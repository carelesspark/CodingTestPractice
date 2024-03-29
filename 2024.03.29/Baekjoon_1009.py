# 백준 1009번 문제
# import sys

# temp = []

# case = int(sys.stdin.readline().rstrip())

# for i in range(case):
#     a, b = map(int, sys.stdin.readline().rstrip().split())
#     temp.append((a ** b) % 10)
    
# for i in temp:
#     print(i)
# ------------------------------------------------------------
# 위 코드를 제출할 경우 시간 초과가 발생, a ** b 형태 대신 다른 방법으로 코드를 작성해야 함

# 1 -> 1
# 2 -> 2 4 8 6
# 3 -> 3 9 7 1
# 4 -> 4 6
# 5 -> 5
# 6 -> 6
# 7 -> 7 9 3 1
# 8 -> 8 4 2 6
# 9 -> 9 1

import sys

case = int(sys.stdin.readline().rstrip())

for i in range(case):
    a, b = map(int, sys.stdin.readline().rstrip().split())
    a = a % 10

    if a == 0:
        print(10)
    elif a == 1 or a == 5 or a == 6:
        print(a)
    elif a == 4 or a == 9:
        b = b % 2
        if b == 1:
            print(a)
        else:
            print((a * a) % 10)
    else:
        b = b % 4
        if b == 0:
            print((a ** 4) % 10)
        else:
            print((a ** b) % 10)

# 시간 초과가 발생할 수 있는 이유 중 하나는 a와 b의 범위가 주어젔는데 제일 큰 a = 100, b = 1000000 일 경우 제곱 계산을 하는 과정이 엄청 오래걸림
# 그래서 이러한 문제는 무작정 **제곱 계산으로 통일하기 보다 해당 숫자의 제곱 규칙을 찾아서 조건문으로 하나하나 처리해주어야 함