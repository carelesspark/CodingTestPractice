# 백준 1978번 문제
import sys

count = int(sys.stdin.readline().rstrip())
num = list(map(int, sys.stdin.readline().rstrip().split()))

temp = 0

for i in range(len(num)):
    for j in range(2, num[i] + 1):
        if num[i] % j == 0:
            if num[i] == j:
                temp += 1
            
            break

print(temp)

# --------------------------------------------------------------
# 소수 구하는 방법 : 주어진 숫자에 2 ~ 주어진 숫자 범위 안의 모든 수를 다 나눠보는데 만약 중간에 나눠 떨어지는 수가 있으면 break, 만약 없고 마지막 범위의 수만이 
# 주어진 수와 나눴을 때 나눠 떨어질 경우 소수