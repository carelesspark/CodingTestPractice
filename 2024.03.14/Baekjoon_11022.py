# 백준 11022번 문제
import sys

num = int(sys.stdin.readline().rstrip())

for i in range(num):
    a, b = map(int, sys.stdin.readline().rstrip().split())
    print("Case #%d: %d + %d = %d" %((i + 1), a, b, (a + b)))