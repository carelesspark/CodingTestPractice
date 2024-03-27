# 백준 2675번 문제
import sys

count = int(sys.stdin.readline().rstrip())

for i in range(count):
    r, s = map(str, sys.stdin.readline().rstrip().split())
    for i in s:
        print(i * int(r), end="")
    print()

