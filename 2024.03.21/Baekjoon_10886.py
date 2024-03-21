# 백준 10886번 문제
import sys

temp = []

count = int(sys.stdin.readline().rstrip())

for i in range(count):
    a = int(sys.stdin.readline().rstrip())
    temp.append(a)

if temp.count(0) > temp.count(1):
    print("Junhee is not cute!")
elif temp.count(1) > temp.count(0):
    print("Junhee is cute!")