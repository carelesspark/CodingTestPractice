# 백준 2460번 문제
import sys

people = 0
temp = []

for i in range(10):
    off, on = map(int, sys.stdin.readline().rstrip().split())
    people += (on - off)
    temp.append(people)

print(max(temp))