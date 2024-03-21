# 백준 2010번 문제
import sys

count = int(sys.stdin.readline().rstrip())

possible = 0

for i in range(count):
    n = int(sys.stdin.readline().rstrip())
    possible += n

print(possible - count + 1)