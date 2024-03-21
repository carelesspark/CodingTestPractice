# 백준 2490번 문제
import sys

sum = 0

for i in range(3):
    a, b, c, d = map(int, sys.stdin.readline().rstrip().split())
    sum = a + b + c + d

    if sum == 0:
        print("D")
    elif sum == 1:
        print("C")
    elif sum == 2:
        print("B")
    elif sum == 3:
        print("A")
    else:
        print("E")