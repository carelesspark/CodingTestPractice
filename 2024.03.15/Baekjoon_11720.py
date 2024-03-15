# 백준 11720번 문제
import sys

count = int(sys.stdin.readline().rstrip())

num = list(map(int, sys.stdin.readline().rstrip()))

sum = 0
for i in range(count):
    sum += num[i]

print(sum)