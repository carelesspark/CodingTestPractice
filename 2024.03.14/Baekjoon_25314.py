# 백준 25314번 문제
import sys
num = int(sys.stdin.readline().rstrip())

temp = ""
for i in range(num):
    if i % 4 == 0:
        temp += "long "

print(temp + "int")