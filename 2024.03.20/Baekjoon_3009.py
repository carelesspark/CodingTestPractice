# 백준 3009번 문제
import sys

temp_x = []
temp_y = []

for i in range(3):
    x, y = map(int, sys.stdin.readline().rstrip().split())
    temp_x.append(x)
    temp_y.append(y)

temp_x.sort()
temp_y.sort()

if temp_x[0] == temp_x[1]:
    print(temp_x[2], end=" ")
else:
    print(temp_x[0], end=" ")

if temp_y[0] == temp_y[1]:
    print(temp_y[2], end=" ")
else:
    print(temp_y[0], end=" ")