# 백준 2747번 문제 
import sys

idx = int(sys.stdin.readline().rstrip())

arr = [0, 1]

for i in range(2, idx + 1):
    temp = arr[i - 1] + arr[i - 2]
    arr.append(temp)

print(arr[idx])