# 백준 2581번 문제
import sys

m = int(sys.stdin.readline().rstrip())
n = int(sys.stdin.readline().rstrip())

temp = []
total = 0

for i in range(m, n + 1):
    for j in range(2, i + 1):
        if i % j == 0:
            if i == j:
                temp.append(i)
                total += i
            break

if total == 0:
    print(-1)
else:
    print(total)
    print(min(temp))
