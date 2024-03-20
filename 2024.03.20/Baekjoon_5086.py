# 백준 5086번 문제
import sys

while True:
    m, n = map(int, sys.stdin.readline().rstrip().split())
    if m == 0 and n == 0:
        break

    if m > n:
        if m % n == 0:
            print("multiple")
        else:
            print("neither")
    elif m < n:
        if n % m == 0:
            print("factor")
        else:
            print("neither")