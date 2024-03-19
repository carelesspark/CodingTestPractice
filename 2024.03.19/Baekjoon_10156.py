# 백준 10156번 문제
import sys

k, m, n = map(int, sys.stdin.readline().rstrip().split())

price = k * m
have_money = n

if price <= have_money:
    print(0)
else:
    print(price - have_money)
