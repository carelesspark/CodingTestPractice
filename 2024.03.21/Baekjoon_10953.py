# 백준 10953번 문제
import sys

case = int(sys.stdin.readline().rstrip())

for i in range(case):
    a, b = map(int, sys.stdin.readline().rstrip().split(","))

    print(a + b)