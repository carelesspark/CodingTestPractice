# 백준 1075번 문제
import sys

n = sys.stdin.readline().rstrip()
f = int(sys.stdin.readline().rstrip())

temp = int(n[:-2] + '00')

while True:
    if temp % f == 0:
        break
    temp += 1

result = str(temp)
print(result[-2:])

# 파이썬 배열 슬라이싱 잘 활용해보기