# 백준 10824번 문제
import sys

a, b, c, d = map(str, sys.stdin.readline().rstrip().split())

first = a + b
second = c + d
print(int(first) + int(second))