# 백준 2506번 문제
import sys

score = 0
bonus = 0

count = int(sys.stdin.readline().rstrip())
ox = list(map(int, sys.stdin.readline().rstrip().split()))

for i in ox:
    if i == 1:
        bonus += 1
        score += bonus
    else:
        bonus = 0

print(score)

