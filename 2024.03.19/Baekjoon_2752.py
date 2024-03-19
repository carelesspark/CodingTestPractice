# 백준 2752번 문제
import sys

a = list(map(int, sys.stdin.readline().rstrip().split()))
a.sort()
print(a[0], a[1], a[2], end=" ")
