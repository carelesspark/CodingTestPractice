# 백준 10992번 문제
import sys

star = int(sys.stdin.readline().rstrip())

for i in range(1, star + 1):
    if i == 1 or i == star:
        print(" " * (star - i) + "*" * ((2 * i) - 1))
    else:
        print(" " * (star - i) + "*" + " " * ((2 * i) - 3) + "*")