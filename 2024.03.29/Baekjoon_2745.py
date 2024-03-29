# 백준 2745번 문제
import sys

n, b = map(str, sys.stdin.readline().rstrip().split())

number = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
n = ''.join(reversed(n))
b = int(b)

result = 0
j = 0

for i in range(len(n) - 1, -1, -1):
    j -= 1
    result += number.index(n[i]) * b ** i 

print(result)

# --------------------------------------------------------------
# 예를 들어 ZZZZZ 36일 경우 number에 저장해놓은 Z의 인덱스 번호 = 35, 입력한 b의 값인 36진법
# ZZZZZ이므로 (35 * 36의 4제곱) + (35 * 36의 3제곱) + (35 * 36의 2제곱) + (35 * 36의 1제곱) + (35 * 36의 0제곱)
# 다 더한 값이 정답