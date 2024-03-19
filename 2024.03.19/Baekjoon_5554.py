# 백준 5554번 문제
import sys

sum = 0

for i in range(4):
    sec = int(sys.stdin.readline().rstrip())
    sum += sec

m = int(sum / 60)
s = sum % 60

print(m)
print(s)