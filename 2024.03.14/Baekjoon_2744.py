# 백준 2744번 문제
import sys

temp = sys.stdin.readline().rstrip()

for i in temp:
    if i.isupper() == True:
        print(i.lower(), end="")
    else:
        print(i.upper(), end="")


