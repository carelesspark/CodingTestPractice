# 백준 2576번 문제
import sys

sum = 0
temp = []

for i in range(7):
    num = int(sys.stdin.readline().rstrip())
    
    if num % 2 == 1:
        sum += num
        temp.append(num)

if sum == 0:
    print(-1)
else: 
    print(sum)
    print(min(temp))
