# 백준 2443번 문제
import sys

star = int(sys.stdin.readline().rstrip())

for i in range(star, 0, -1):
    print(" " * (star - i) + "*" * ((i * 2) - 1))