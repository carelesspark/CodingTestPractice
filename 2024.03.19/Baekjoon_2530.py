# 백준 2530번 문제
import sys

h, m ,s = map(int, sys.stdin.readline().rstrip().split())
time = int(sys.stdin.readline().rstrip())

s += time
m += s // 60
h += m // 60
print(h % 24, m % 60, s % 60)

# --------------------------------------
# //로 더해지는 time의 시분초 값을 알아내 기존 h, m, s에 저장하고, 24 60 60을 초과한 경우를 위해 출력할 때, h, m, s에 60을 %함(넘었을 경우 나눈 나머지, 넘지 않았을 경우 그대로 출력)