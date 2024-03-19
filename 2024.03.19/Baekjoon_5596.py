# 백준 5596번 문제
import sys

a = list(map(int, sys.stdin.readline().rstrip().split()))
b = list(map(int, sys.stdin.readline().rstrip().split()))

sum1 = 0
sum2 = 0

for i in range(4):
    sum1 += a[i]
    sum2 += b[i]

print(max(sum1, sum2))


