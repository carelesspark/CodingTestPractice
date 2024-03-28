# 백준 2750번 문제
import sys

temp = []

count = int(sys.stdin.readline().rstrip())

for i in range(count):
    num = int(sys.stdin.readline().rstrip())
    temp.append(num)

temp.sort()

for i in temp:
    print(i)