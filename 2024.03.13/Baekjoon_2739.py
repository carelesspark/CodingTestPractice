# 백준 2739번 문제

count = int(input())

for i in range(9):
    print(count, "*" , (i + 1) , "=" , (count * (i + 1)))