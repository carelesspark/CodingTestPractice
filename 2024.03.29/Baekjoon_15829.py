# 백준 15829번 문제
import sys

count = int(sys.stdin.readline().rstrip())
word = sys.stdin.readline().rstrip()

result = 0

for i in range(count):
    num = ord(word[i]) - 96
    result += num * (31 ** i)

print(result % 1234567891)   