# 백준 1712번 문제
import sys

a, b, c = map(int, sys.stdin.readline().rstrip().split())

if b >= c:
    print(-1)
else:
    price = a // (c - b) + 1
    print(price)

