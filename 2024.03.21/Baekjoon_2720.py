# 백준 2720번 문제
# import sys

# case = int(sys.stdin.readline().rstrip())

# for i in range(case):
#     cent = int(sys.stdin.readline().rstrip())

#     quarter = cent // 25
#     dime = (cent % 25) // 10
#     nickel = ((cent % 25) % 10) // 5
#     penny = (((cent % 25) % 10) % 5) // 1

#     print(quarter, dime, nickel, penny)

# ------------------------------------------
# 위의 코드를 보면 전의 계산 과정이 반복되는 것을 확인할 수 있음
# 그렇기 때문에 이를 간편하게 만들 필요가 있음
    
import sys
case = int(sys.stdin.readline().rstrip())

for i in range(case):
    cent = int(sys.stdin.readline().rstrip())

    for i in [25, 10, 5, 1]:
        print(cent // i, end=" ")
        cent = cent % i # 이 코드가 위의 dime에서 (cent % 25)와 같은 역할을 함, 그렇게 다음 for문으로 넘어가면 적용된 상태의 cent // i만 해주면 됨
    print()
