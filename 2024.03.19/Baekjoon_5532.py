# 백준 5532번 문제
import sys

l = int(sys.stdin.readline().rstrip())
a = int(sys.stdin.readline().rstrip())
b = int(sys.stdin.readline().rstrip())
c = int(sys.stdin.readline().rstrip())
d = int(sys.stdin.readline().rstrip())

if a % c == 0:
    temp1 = a // c
else:
    temp1 = (a // c) + 1

if b % d == 0:
    temp2 = b // d
else:
    temp2 = (b // d) + 1

print(l - max(temp1, temp2))

# ----------------------------------------------
# a와 c, b와 d를 각각 나눠 0이 나오면 걸리는 시간이 나오며, 만약 0이 아닐 경우 하루를 더 해야된다는 의미이므로 몫+1을 해준다
# 그리고 둘 다 끝난 상태여야 하므로 둘 중 오래 걸린 날을 방학시간과 뺀다.