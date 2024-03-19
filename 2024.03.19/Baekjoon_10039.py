# 백준 10039번 문제
import sys

sum = 0

for i in range(5):
    score = int(sys.stdin.readline().rstrip())
    if score >= 40:
        sum += score
    elif score < 40:
        sum += 40

avg = int(sum / 5)
print(avg)
