# 백준 3003번 문제
import sys

chess = [1, 1, 2, 2, 2, 8]
temp = []

have = list(map(int, sys.stdin.readline().rstrip().split()))


for i in range(len(chess)):
    temp.append(chess[i] - have[i])

for i in range(len(temp)):
    print(temp[i], end=" ")
