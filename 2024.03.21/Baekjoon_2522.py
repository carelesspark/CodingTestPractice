# 백준 2522번 문제
import sys

star = int(sys.stdin.readline().rstrip())

for i in range(1, star + 1):
    print(" " * (star - i) + "*" * i)

for i in range(star - 1, 0, -1):
    print(" " * (star - i) + "*" * i)