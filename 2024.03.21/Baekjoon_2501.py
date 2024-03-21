# 백준 2501번 문제
import sys

temp = []

n, k = map(int, sys.stdin.readline().rstrip().split())

for i in range(1, n + 1):
    if n % i == 0:
        temp.append(i)

temp.sort()

if len(temp) < k:
    print(0)
else:
    print(temp[k - 1])