# 백준 8393번 문제
import sys
num = int(sys.stdin.readline().rstrip())

sum = 0
for i in range(1, num + 1):
    sum += i

print(sum)