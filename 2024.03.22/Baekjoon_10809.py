# 백준 10809번 문제
# import sys

# alphabet = []
# temp = [-1] * 26

# s = sys.stdin.readline().rstrip()

# for i in range(97, 123):
#     alphabet.append(chr(i))

# for i in s:
#     if alphabet.count(i):
#         temp[alphabet.index(i)] = s.index(i)

# for i in temp:
#     print(i, end=" ")

# ------------------------------------------
# find 내장 함수로 간편하게 찾을 수 있음
# find 함수는 해당 배열에 주어진 인덱스 값의 인덱스 번호를 반환함, 만약 없을 경우 -1 반환
    
import sys

s = sys.stdin.readline().rstrip()

for i in 'abcdefghijklmnopqrstuvwxyz':
    print(s.find(i), end=" ")