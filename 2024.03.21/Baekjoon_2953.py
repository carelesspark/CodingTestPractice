# 백준 2953번 문제
import sys

score = 0
temp = []

for i in range(5):
    a, b, c, d = map(int, sys.stdin.readline().rstrip().split())
    score = a + b + c + d
    temp.append(score)

print(temp.index(max(temp)) + 1, max(temp))
