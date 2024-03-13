# 백준 15552번 문제

# temp = []

# count = int(input())

# for i in range(count):
#     a, b = map(int, input().split())
#     sum = a + b
#     temp.append(sum)

# for i in range(count):
#     print(temp[i])

# ------------------------------------------------------------ 위 코드는 시간 초과 발생한 코드


import sys

count = int(input())

for i in range(count):
    a, b = map(int, sys.stdin.readline().split())
    print(a + b)

# input함수보다 sys.stdin.readline함수가 더 효율적이며 시간초과를 방지할 수 있음
# 또한 사이트에 나온 바와 같이 입력받은 값을 저장해두었다가 한번에 출력하지 않아도 됌