# 백준 2845번 문제
import sys

l, p = map(int, sys.stdin.readline().rstrip().split())
newspaper = list(map(int, sys.stdin.readline().rstrip().split()))

total = l * p
for i in range(5):
    if newspaper[i] == total:
        print(0, end=" ")
    else:
        print(newspaper[i] - total, end=" ")
