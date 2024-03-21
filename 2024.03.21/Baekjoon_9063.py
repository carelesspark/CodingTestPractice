# 백준 9063번 문제
import sys

temp_x = []
temp_y = []

point = int(sys.stdin.readline().rstrip())

if point == 1:
    for i in range(1):
        x, y = map(int, sys.stdin.readline().rstrip().split())
        print(0)
else:
    for i in range(point):
        x, y = map(int, sys.stdin.readline().rstrip().split())
        temp_x.append(x)
        temp_y.append(y)

    area = (max(temp_x) - min(temp_x)) * (max(temp_y) - min(temp_y))
    print(area)
