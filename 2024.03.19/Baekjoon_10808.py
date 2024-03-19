# 백준 10808번 문제
import sys
text = sys.stdin.readline().rstrip()
temp = [0] * 26

print(temp)

for i in text:
    temp[ord(i) - 97] += 1

for i in range(len(temp)):
    print(temp[i], end=" ")