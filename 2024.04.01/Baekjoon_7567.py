# 백준 7567번 문제
import sys

bowl = sys.stdin.readline().rstrip()

sum = 10

for i in range(1, len(bowl)):
    if bowl[i - 1] != bowl[i]:
        sum += 10
    else:
        sum += 5

print(sum)
