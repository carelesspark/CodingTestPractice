# 백준 2577번 문제
# import sys

# num = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
# count = [0] * 10
# a = int(sys.stdin.readline().rstrip())
# b = int(sys.stdin.readline().rstrip())
# c = int(sys.stdin.readline().rstrip())

# sum = a * b * c

# for i in str(sum):
#     for j in range(10):
#         if i == num[j]:
#             count[j] += 1

# for i in range(10):
#     print(count[i])

# -----------------------------------------------------
# in / count 를 사용하자
import sys

a = int(sys.stdin.readline().rstrip())
b = int(sys.stdin.readline().rstrip())
c = int(sys.stdin.readline().rstrip())

sum = a * b * c

for i in range(10):
    if str(i) in str(sum):
        print(str(sum).count(str(i)))
    else:
        print(0)