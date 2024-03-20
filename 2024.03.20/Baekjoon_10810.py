# 백준 10810번 문제
import sys

n, m = map(int, sys.stdin.readline().rstrip().split())

arr = [0] * n

for a in range(m):
    i, j, k = map(int, sys.stdin.readline().rstrip().split())
    for b in range(i - 1, j):
        arr[b] = k

for num in arr:
    print(num, end=" ")

# -------------------------------------------------------------
# arr 배열 변수의 크기를 미리 정하면 안되고, 입력한 크기 값을 이용해 배열의 크기를 정해야 함