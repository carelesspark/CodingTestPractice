# 백준 10991번 문제
import sys

star = int(sys.stdin.readline().rstrip())

for i in range(1, star + 1):
    print(" " * (star - i) + "* " * (i - 1) + "*")

# --------------------------------------------------
# 반복되는 규칙 자세히 보기