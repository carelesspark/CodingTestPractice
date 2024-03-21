# 백준 2566번 문제
import sys

temp = []
temp2 = 0
x = 0
y = 0

for i in range(9):
    arr = list(map(int, sys.stdin.readline().rstrip().split()))
    temp.append(arr)

for i in range(9):
    for j in range(9):
        if temp2 <= temp[i][j]:
            temp2 = temp[i][j]
            x = i + 1
            y = j + 1

print(temp2)
print(x, y, end=" ")
    