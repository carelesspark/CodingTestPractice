# 백준 25304번 문제
import sys

temp = 0
sum = 0

total = int(sys.stdin.readline().rstrip())
count = int(sys.stdin.readline().rstrip())

for i in range(count):
    price, amount = map(int, sys.stdin.readline().rstrip().split())
    temp = price * amount
    sum += temp

if total == sum:
    print("Yes")
else:
    print("No")
