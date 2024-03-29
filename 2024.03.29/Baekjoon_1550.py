# 백준 1550번 문제
import sys

input = sys.stdin.readline().rstrip()

input = ''.join(reversed(input))

hexadecimal = '0123456789ABCDEF'
result = 0

for i in range(len(input) - 1, -1, -1):
    result += hexadecimal.index(input[i]) * (16 ** i)

print(result)

# -----------------------------------------------------
# 더 쉬운 방법이 있다.

print(int(input(), 16)) 
# 위 코드가 맨 위의 코드랑 같은 기능을 한다