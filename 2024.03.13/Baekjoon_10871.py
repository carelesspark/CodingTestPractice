# 백준 10871번 문제

import sys

temp = []

size, num = map(int, sys.stdin.readline().split())
array = list(map(int, sys.stdin.readline().split()))

for i in range(size):
    if array[i] < num:
        print(array[i], end=" ")


# 줄 바꿈 되지 않은 상태의 값들을 출력하고 싶을 경우 현재 속한 출력물을 다음 출력물과 이어지게 해주는 end함수를 사용한다.