# 백준 2476번 문제
import sys

temp = []

count = int(sys.stdin.readline().rstrip())

for i in range(count):
    arr = list(map(int, sys.stdin.readline().rstrip().split()))

    if arr[0] == arr[1] == arr[2]:
        reward = 10000 + (arr[0] * 1000)
        temp.append(reward)
    elif arr[0] == arr[1] or arr[0] == arr[2]:
        reward = 1000 + (arr[0] * 100)
        temp.append(reward)
    elif arr[1] == arr[2]:
        reward = 1000 + (arr[1] * 100)
        temp.append(reward)
    else:
        reward = max(arr) * 100
        temp.append(reward)

print(max(temp))