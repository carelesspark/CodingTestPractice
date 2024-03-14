# 백준 15964번 문제
import sys

def cacl(a, b):
    print((a + b) * (a - b))

a, b = map(int, sys.stdin.readline().rstrip().split())
cacl(a, b)