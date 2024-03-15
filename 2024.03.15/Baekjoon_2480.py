# 백준 2480번 문제
import sys

dice1, dice2, dice3 = map(int, sys.stdin.readline().rstrip().split())

if dice1 == dice2 == dice3:
    print(10000 + dice1 * 1000)
elif dice1 == dice2 or dice1 == dice3:
    print(1000 + dice1 * 100)
elif dice2 == dice3:
    print(1000 + dice2 * 100)
else:
    print(max(dice1, dice2, dice3) * 100)

# -------------------------------------------------------------------------
# 2개만이 같은 값일 경우 A와 B, A와 C 그리고 B와 C의 경우를 생각해야 하기에 2개의 elif로 나눠서 작성
# 그리고 여러 개의 수 중 가장 큰 값을 찾기 위해 내장 함수인 max를 사용!