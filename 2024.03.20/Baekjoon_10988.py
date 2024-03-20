# 백준 10988번 문제
import sys

temp = []

word = list(sys.stdin.readline().rstrip())
temp = list(reversed(word))

if temp == word:
    print(1)
else:
    print(0)