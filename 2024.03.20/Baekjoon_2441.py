# 백준 2441번 문제
import sys

star = int(sys.stdin.readline().rstrip())

for i in range(star):
    print(" " * i + "*" * (star - i))