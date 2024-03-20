# 백준 1085번 문제
import sys

x, y, w, h = map(int, sys.stdin.readline().rstrip().split())

temp_x = x - 0
temp_y = y - 0

temp_w = w - x
temp_h = h - y

arr = [temp_x, temp_y, temp_w, temp_h]
print(min(arr))