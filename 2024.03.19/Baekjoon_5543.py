# 백준 5543번 문제
import sys

temp_food = []
temp_beverage = []
for i in range(3):
    price = int(sys.stdin.readline().rstrip())
    temp_food.append(price)

for i in range(2):
    price = int(sys.stdin.readline().rstrip())
    temp_beverage.append(price)

temp_food.sort()
temp_beverage.sort()

print(temp_food[0] + temp_beverage[0] - 50)

# -----------------------------------------------
# 먼저 배열 내에서 가장 작은 값을 찾는 방법 중 하나는 sort함수를 이용해 배열 인덱스 0번에 가장 작은 값을 위치시키는 것이다.
# 그렇게 2개의 배열의 0번에 각각 가장 작은 값이 들어가 있을 것이고, 이를 더한 후 50을 빼면 문제의 답을 찾을 수 있다.