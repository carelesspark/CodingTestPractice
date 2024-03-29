# 백준 5585번 문제
# import sys

# pay = int(sys.stdin.readline().rstrip())
# charge = 1000 - pay

# one = charge // 500
# two = (charge % 500) // 100
# three = ((charge % 500) % 100) // 50
# four = (((charge % 500) % 100) % 50) // 10
# five = ((((charge % 500) % 100) % 50) % 10) // 5
# six = (((((charge % 500) % 100) % 50) % 10) % 5) // 1

# print(one + two + three + four + five + six)

# -----------------------------------------------------
# while문을 통해 간단하게 만들 수 있다.

import sys

pay = int(sys.stdin.readline().rstrip())
coin = [500, 100, 50, 10, 5, 1]
charge = 1000 - pay

i = 0
count = 0

while charge > 0:
    count += charge // coin[i]
    charge = charge % coin[i]
    i += 1

print(count)