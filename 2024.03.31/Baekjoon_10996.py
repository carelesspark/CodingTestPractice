# 백준 10996번 문제
import sys

star = int(sys.stdin.readline().rstrip())

for i in range(star):
    if star == 1:
        print("*")
        break

    print("* " * (star - star // 2))
    print(" *" * (star // 2))