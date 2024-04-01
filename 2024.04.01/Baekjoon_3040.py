# 백준 3040번 문제
# import sys, itertools

# temp = []

# for i in range(9):
#     num = int(sys.stdin.readline().rstrip())
#     temp.append(num)

# result = sum(temp) - 100

# for i in itertools.combinations(temp, 2):
#     if sum(i) == result:
#        temp.remove(i[0])
#        temp.remove(i[1])

# for i in temp:
#     print(i)

# ------------------------------------------------

import sys, itertools

temp = []

for i in range(9):
    num = int(sys.stdin.readline().rstrip())
    temp.append(num)

for i in itertools.combinations(temp, 7):
    if sum(i) == 100:
      for j in i:
         print(j)

# 굳이 2개의 조합을 구해서 합하고 해당 조건을 통과하면 해당 값을 배열에서 지우는 방식을 사용하지 않고, 7개의 조합을 구해서 그 합이 100이 되면 모두 출력하게 만드는 코드가 더
# 간편하다