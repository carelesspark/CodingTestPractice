# 백준 10430번 문제
import sys
a, b, c = map(int, sys.stdin.readline().rstrip().split())
print((a + b) % c)
print(((a % c) + (b % c)) % c)
print((a * b) % c)
print(((a % c) * (b % c)) % c)