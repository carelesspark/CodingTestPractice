# 백준 5073번 문제
import sys

while True:
    triangle = list(map(int, sys.stdin.readline().rstrip().split()))
    if triangle[0] == 0 and triangle[1] == 0 and triangle[2] == 0:
        break

    triangle.sort()

    if triangle[2] < triangle[0] + triangle[1]:
        if triangle[0] == triangle[1] == triangle[2]:
            print("Equilateral")
        elif triangle[0] == triangle[1] or triangle[1] == triangle[2] or triangle[0] == triangle[2]:
            print("Isosceles")
        else:
            print("Scalene")
    else:
        print("Invalid")