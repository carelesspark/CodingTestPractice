# 백준 10872번 문제
# import math
# fac = int(input())

# print(math.factorial(fac))

# ----------------------------------------------------------------

fac = int(input())

multi = 1

for i in range(1, fac+1):
    multi *= i

print(multi)

# math 라이브러리 이외의 방법인 for문으로도 코드 만들어보기