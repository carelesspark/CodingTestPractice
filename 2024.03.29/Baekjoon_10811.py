# 백준 10811번 문제
import sys

n, m = map(int, sys.stdin.readline().rstrip().split())

basket = []
for i in range(1, n + 1):
    basket.append(i)

for k in range(m):
    i, j = map(int, sys.stdin.readline().rstrip().split())

    temp = basket[i - 1 : j]
    temp.reverse()
    basket[i - 1 : j] = temp

for i in basket:
    print(i, end=" ")