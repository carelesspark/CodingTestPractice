# 백준 1100번 문제
import sys

result = 0

for i in range(8):
    chess = sys.stdin.readline().rstrip()
    
    if i % 2 == 0:
        for j in range(len(chess)):
            if j % 2 == 0:
                if chess[j] == 'F':
                    result += 1           
    else:
        for j in range(len(chess)):
            if j % 2 == 1:
                if chess[j] == 'F':
                    result += 1

print(result)
