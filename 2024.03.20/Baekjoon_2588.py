# 백준 2588번 문제
import sys

temp = []

a = int(sys.stdin.readline().rstrip())
b = sys.stdin.readline().rstrip()

for i in range(3):
    temp.append(b[i])

print(a * int(temp[2]))
print(a * int(temp[1]))
print(a * int(temp[0]))
print(a * int(b))

# -----------------------------------------------------------
# temp 임시 배열 만들지 않고 바로 b 배열 이용해도 됌
