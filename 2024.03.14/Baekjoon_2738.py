# 백준 2738번 문제
import sys

A = []
B = []

n, m = map(int, sys.stdin.readline().split())

for i in range(n):
    a = list(map(int, sys.stdin.readline().split()))
    A.append(a)

for i in range(n):
    b = list(map(int, sys.stdin.readline().split()))
    B.append(b)

for i in range(n):
    for j in range(m):
        print(A[i][j] + B[i][j], end=" ")
    print("")


# ------------------------------------------------------------------
# 2738번 문제를 풀면서 런타임 에러가 무수히 발생했다.
# 그 이유는 행과 열을 생각하지 않으면서 풀었기에, 단순히 문제에서 3 3을 제공해서 for문으로 값을 저장할 때 n 과 m을 이용했다.
# 하지만 만약 3 3이 아닌 서로 다른 수(ex. 3 과 10, 2 와 7)를 제공할 경우 하나의 for문은 2번만 입력받고, 다른 for문은 7번 입력받는 올바르지 않은 계산식이 생겨버린다.
# 때문에 for문으로 2가지의 행렬을 저장할 때는 반드시 세로를 의미하는 n을 이용해서 for문을 돌려야 한다.