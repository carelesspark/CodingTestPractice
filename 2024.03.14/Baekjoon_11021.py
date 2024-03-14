# 백준 11021번 문제
import sys

num = int(sys.stdin.readline().rstrip())

for i in range(num):
    a, b = map(int, sys.stdin.readline().rstrip().split())
    print("Case #%d: %d" %((i + 1), (a + b)))

# ------------------------------------------------------------
# 파이썬에서는 문자열 내 변수 값을 넣을 때 %()로 묶어서 넣어준다.
# 여러 값을 넣고 싶다면 %()안에 쉼표로 구분!