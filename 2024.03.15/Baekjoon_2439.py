# 백준 2439번 문제
import sys

star = int(sys.stdin.readline().rstrip())

for i in range(1, star + 1):
    print(" " * (star - i) + "*" * i)