# 백준 19532번 문제
import sys

a, b, c, d, e, f = map(int, sys.stdin.readline().rstrip().split())

x = ((e * c) - (b * f)) // ((a * e) - (d * b))
y = ((a * f) - (d * c)) // ((a * e) - (d * b))

print(x, y)

# -----------------------------------------------------------------
# 해당 문제는 브루트 포스 방식으로 풀 수도 있지만, 간단한 법칙이 있다.
# 근의 공식을 이용하면 되는데, 위쪽 식을 이항해서 정리한다음 아래 식에 넣어 y에 대해 풀고 x 구하는 식에 y의 값을 넣어 풀면 관련된 식이 나온다.
# 관련 식을 이용하여 문제를 풀이하면 된다.

import sys

a, b, c, d, e, f = map(int, sys.stdin.readline().rstrip().split())

for x in range(-999, 1000):
    for y in range(-999, 1000):
        if (a * x) + (b * y) == c and (d * x) + (e * y) == f:
            print(x, y)
            break

# 브루트 포스 방식