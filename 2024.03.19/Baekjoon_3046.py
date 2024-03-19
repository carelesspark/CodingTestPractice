# 백준 3046번 문제
import sys

r1, s = map(int, sys.stdin.readline().rstrip().split())

r2 = s * 2 - r1

print(r2)