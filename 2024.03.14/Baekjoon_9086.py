# 백준 9086번 문제
import sys

num = int(sys.stdin.readline().rstrip())

for i in range(num):
    word = sys.stdin.readline().rstrip()
    first = 0
    last = len(word)
    print(word[0] + word[last - 1])

# ------------------------------------------------
# 글자의 마지막 인덱스 값을 가져올 때, 인덱스 값으로 -1을 사용해도 됌
# print(word[0] + word[-1])