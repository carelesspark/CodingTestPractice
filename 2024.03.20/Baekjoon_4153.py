# 백준 4153번 문제
import sys

while True:
    a, b, c = map(int, sys.stdin.readline().rstrip().split())

    if a == 0 and b == 0 and c == 0:
        break
    
    if (c**2 == (a**2 + b**2)) or (a**2 == (b**2 + c**2)) or (b**2 == (a**2 + c**2)):
        print("right")
    else:
        print("wrong")