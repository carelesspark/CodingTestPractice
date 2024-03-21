# 백준 5565번 문제
import sys

total = int(sys.stdin.readline().rstrip())

for i in range(9):
    book = int(sys.stdin.readline().rstrip())
    total -= book

print(total)