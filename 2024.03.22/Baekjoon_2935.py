# 백준 2935번 문제
import sys

a = int(sys.stdin.readline().rstrip())
calc = sys.stdin.readline().rstrip()
b = int(sys.stdin.readline().rstrip())

if calc == "*":
    print(a * b)
elif calc == "+":
    print(a + b)