# 백준 10807번 문제
import sys
num = int(input())
count = 0

arr = list(map(int, sys.stdin.readline().split()))

search = int(input())

for i in range(num):
    if arr[i] == search:
        count+=1

print(count)