# 백준 27866번 문제
# import sys

# arr = []

# word = sys.stdin.readline().rstrip()
# index = int(sys.stdin.readline().rstrip())

# for i in word:
#     arr.append(i)

# print(arr[index - 1])

# ----------------------------------------- 
# 위의 코드가 처음 제출한 코드

import sys

word = sys.stdin.readline().rstrip()
index = int(sys.stdin.readline().rstrip())

print(word[index - 1])

# 그냥 변수 word에 원하는 인덱스 번호인 index 변수 값을 배열 값으로 주면 된다.
# 굳이 배열 변수를 따로 만들지 않아도 된다.