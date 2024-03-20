# 백준 2562번 문제
import sys

temp = []

for i in range(9):
    num = int(sys.stdin.readline().rstrip())
    temp.append(num)

m = max(temp)
index = temp.index(m)

print(m)
print(index + 1)