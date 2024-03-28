# 백준 2908번 문제
import sys

a, b = map(str, sys.stdin.readline().rstrip().split())

list_a = list(a)
list_b = list(b)

list_a.reverse()
list_b.reverse()

reverse_a = int(''.join(list_a))
reverse_b = int(''.join(list_b))

if reverse_a > reverse_b:
    print(reverse_a)
elif reverse_a < reverse_b:
    print(reverse_b)

# ----------------------------------------------------------
# ''.join()는 리스트를 문자열로 변환시켜주는 기능을 가진 함수
        