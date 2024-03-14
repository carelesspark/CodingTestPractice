# 백준 1271번 문제
import sys

n, m = map(int, sys.stdin.readline().rstrip().split())
print(n // m)
print(n % m)