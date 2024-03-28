# 백준 2798번 문제
# import sys, itertools

# n, m = map(int, sys.stdin.readline().rstrip().split())

# card = list(map(int, sys.stdin.readline().rstrip().split()))

# result = 0

# for comb in itertools.combinations(card, 3):
#     if sum(comb) <= m:
#         result = max(result, sum(comb))
# print(result)

# ----------------------------------------------------------
# for문으로 푸는 방법도 있지만, itertools 라이브러리의 combinations 함수를 이용해서 문제를 풀 수 있다.
# combinations함수는 list와 조합의 수를 인수로 받는데, 이 함수를 사용하면 list안에 있는 원소들을 (입력한 조합의 수)개의 조합으로 만들어준다.
# 그렇게 나온 조합을 sum하고 민액 m의 이하 값일 경우 result에 넣는데, 이때 배열에 값을 저장해도 되지만, max(a, b)를 통해 기존 result 값이 크면 result를, 방금 만든 sum(comb)값이 크면
# result에 sum(comb)값을 저장하는 형식으로 만든다.
# 그렇게 for문이 끝나면 m을 넘지 않는 합계 중 가장 큰 값을 출력할 수 있다.

import sys

n, m = map(int, sys.stdin.readline().rstrip().split())

card = list(map(int, sys.stdin.readline().rstrip().split()))
result = 0 

for i in range(n):
    for j in range(i + 1, n):
        for k in range(j + 1, n):
            if card[i] + card[j] + card[k] <= m:
                result = max(result, card[i] + card[j] + card[k])

print(result)

# 위의 방식은 for문을 이용한 방식이다.