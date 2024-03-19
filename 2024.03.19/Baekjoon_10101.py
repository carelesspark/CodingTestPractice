# 백준 10101번 문제
import sys

temp = []

for i in range(3):
    angle = int(sys.stdin.readline().rstrip())
    temp.append(angle)

a = temp[0]
b = temp[1]
c = temp[2]

sum = a + b + c

if a == b == c == 60:
    print("Equilateral")
elif sum == 180 and (a == b or a == c or b == c):
    print("Isosceles")
elif sum == 180 and (a != b and a != c and b != c):
    print("Scalene")
elif sum != 180:
    print("Error")