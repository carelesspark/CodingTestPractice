# 백준 4999번 문제
import sys

str1 = sys.stdin.readline().rstrip()
str2 = sys.stdin.readline().rstrip()

if len(str1) < len(str2):
    print("no")
else:
    print("go")
