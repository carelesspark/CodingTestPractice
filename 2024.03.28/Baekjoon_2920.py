# 백준 2920번 문제
import sys

c_major = list(map(str, sys.stdin.readline().rstrip().split()))

if ''.join(c_major) == '12345678':
    print('ascending')
elif ''.join(c_major) == '87654321':
    print('descending')
else:
    print('mixed')