# 백준 3052번 문제
# import sys

# temp = []
# different = 0

# for i in range(10):
#     num = int(sys.stdin.readline().rstrip())

#     temp.append(num % 42)

# temp.sort()
# for i in range(0, 9):
#     if temp[i] != temp[i + 1]:
#         different += 1

# print(different + 1)

# ----------------------------------------------
# 사이트에서는 맞았다고 하지만 접근방식이 틀린 것 같아 수정

import sys

temp = []

for i in range(10):
    num = int(sys.stdin.readline().rstrip())

    value = num % 42

    if value not in temp:
        temp.append(value)

print(len(temp))

    