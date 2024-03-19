# 백준 10797번 문제
import sys

day = int(sys.stdin.readline().rstrip())
cars = list(map(int, sys.stdin.readline().rstrip().split()))

print(cars.count(day))