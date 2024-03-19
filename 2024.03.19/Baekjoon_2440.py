# 백준 2440번 문제

import sys

star = int(sys.stdin.readline().rstrip())

for i in range(star):
    print("*" * (star - i))