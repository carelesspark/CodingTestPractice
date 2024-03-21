# 백준 2455번 문제
import sys

temp = []
people = 0

for i in range(4):
    off, on = map(int, sys.stdin.readline().rstrip().split())
    people+=(on - off)
    temp.append(people)

print(max(temp))