# 백준 2914번 문제
import sys

a, i = map(int, sys.stdin.readline().rstrip().split())

print((a * i) - a + 1)