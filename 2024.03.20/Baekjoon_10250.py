# 백준 10250번 문제
import sys

case = int(sys.stdin.readline().rstrip())

for i in range(case):
    h, w, n = map(int, sys.stdin.readline().rstrip().split())

    if n % h == 0:
        start = h
        end = int(n // h)
    else:
        start = n % h
        end = int(n // h) + 1
    print(start * 100 + end)
