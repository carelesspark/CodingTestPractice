# 백준 1977번 문제
import sys

m = int(sys.stdin.readline().rstrip())
n = int(sys.stdin.readline().rstrip())

temp = []

for i in range(1, 10001):
    result = i * i
    if result >= m and result <= n:
        temp.append(result)

if len(temp) == 0:
    print(-1)
else:
    print(sum(temp))
    print(min(temp))
    
        
