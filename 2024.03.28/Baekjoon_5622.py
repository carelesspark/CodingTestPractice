# 백준 5622번 문제
import sys

dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']

temp = 0

alphabet = sys.stdin.readline().rstrip()

for i in range(len(alphabet)):
    for j in dial:
        if alphabet[i] in j:
            temp += dial.index(j) + 3

print(temp)