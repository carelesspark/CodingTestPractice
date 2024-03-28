# 백준 10813번 문제
import sys

n, m = map(int, sys.stdin.readline().rstrip().split())

basket = []
for i in range(1, n + 1):
    basket.append(i)

for i in range(m):
    i, j = map(int, sys.stdin.readline().rstrip().split())
    
    temp = basket[i - 1]
    basket[i - 1] = basket[j - 1]
    basket[j - 1] = temp

for i in basket:
    print(i, end=" ")