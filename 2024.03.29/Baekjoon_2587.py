# 백준 2587번 문제
import sys

temp = []
total = 0

for i in range(5):
    num = int(sys.stdin.readline().rstrip())
    temp.append(num)

    total += num

temp.sort()
print(total // 5)
print(temp[2])