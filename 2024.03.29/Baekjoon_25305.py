# 백준 25305번 문제
import sys

n, k = map(int, sys.stdin.readline().rstrip().split())

score = list(map(int, sys.stdin.readline().rstrip().split()))
score.sort()
score.reverse()

print(score[k - 1])
