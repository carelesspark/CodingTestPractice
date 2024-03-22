# 백준 1267번 문제
import sys

y = 0
m = 0

count = int(sys.stdin.readline().rstrip())

arr = list(map(int, sys.stdin.readline().rstrip().split()))

for i in range(count):
    if arr[i] < 30:
        y += 10
    else:
        y += (arr[i] // 30) * 10 + 10

for i in range(count):
    if arr[i] < 60:
        m += 15
    else:
        m += (arr[i] // 60) * 15 + 15

if y > m:
    print("M", m, end=" ")
elif y < m:
    print("Y", y, end=" ")
else:
    print("Y", "M", y, end=" ")

