# 백준 2902번 문제
import sys

name = sys.stdin.readline().rstrip().split("-")

for i in range(len(name)):
    for j in range(0, 1):
        print(name[i][j], end="")