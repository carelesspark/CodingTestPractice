# 백준 4101번 문제
import sys

try:
    while True:
        a, b = map(int, sys.stdin.readline().rstrip().split())
        if a > b:
            print("Yes")
        elif a == 0 and b == 0:
            break
        else:
            print("No")
except:
    exit()