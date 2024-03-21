# 백준 10162번 문제
import sys

t = int(sys.stdin.readline().rstrip())

if t % 10 != 0:
    print("-1")
else:
    for i in [300, 60, 10]:
        print(t // i, end=" ")
        t = t % i
