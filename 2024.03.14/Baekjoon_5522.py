# 백준 5522번 문제
import sys

sum = 0
for i in range(5):
    score = int(sys.stdin.readline().rstrip())
    sum += score

print(sum)