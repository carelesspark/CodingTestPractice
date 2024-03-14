# 백준 2338번 문제
import sys

temp = []

for i in range(2):
    num = int(sys.stdin.readline().rstrip())
    temp.append(num)

print(temp[0] + temp[1])
print(temp[0] - temp[1])
print(temp[0] * temp[1])