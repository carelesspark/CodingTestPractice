# 백준 2525번 문제
import sys

h, m = map(int, sys.stdin.readline().rstrip().split())
plus = int(sys.stdin.readline().rstrip())

m = m + plus
h = h + int(m // 60)

print((h % 24), (m % 60), end=" ")