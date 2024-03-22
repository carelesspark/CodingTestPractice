# 백준 14215번 문제
import sys

arr = list(map(int, sys.stdin.readline().rstrip().split()))

arr.sort()

if arr[2] < arr[0] + arr[1]:
    print(arr[0] + arr[1] + arr[2])
else:
    print(2 * (arr[0] + arr[1]) - 1)
    