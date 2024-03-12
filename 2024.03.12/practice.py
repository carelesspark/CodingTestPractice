# 순열 계산(같은 원소 조합 제외)
# from itertools import permutations

# li = ['1', '2', '3']
# result = list(permutations(li, 2))
# print(result)

# 결과 [('1', '2'), ('1', '3'), ('2', '1'), ('2', '3'), ('3', '1'), ('3', '2')]
# ---------------------------------------------------------------------------------------

# 조합 계산(같은 원소&순서 조합 제외)
# from itertools import combinations

# li = ['1', '2', '3']
# result = list(combinations(li, 2))
# print(result)

# 결과 : [('1', '2'), ('1', '3'), ('2', '3')]
# ---------------------------------------------------------------------------------------

# 중복 순열(원소를 사용한 모든 조합)
# from itertools import product

# li = ['1', '2', '3']
# result = list(product(li, repeat = 2))
# print(result)

# 결과 : [('1', '1'), ('1', '2'), ('1', '3'), ('2', '1'), ('2', '2'), ('2', '3'), ('3', '1'), ('3', '2'), ('3', '3')]
# ---------------------------------------------------------------------------------------

# 중복 조합(원소 순서 제외)
# from itertools import combinations_with_replacement

# li = ['1', '2', '3']
# result = list(combinations_with_replacement(li, 2))
# print(result)

# 결과 : [('1', '1'), ('1', '2'), ('1', '3'), ('2', '2'), ('2', '3'), ('3', '3')]
# ---------------------------------------------------------------------------------------

# 원소가 참인 것 출력
# from itertools import compress

# li = ['1', '2', '3']
# result = list(compress(li, [1, 1, 0]))
# print(result)

# 결과 : ['1', '2']
# # ---------------------------------------------------------------------------------------

# deque
# from collections import deque

# list = deque([1, 2, 3, 4, 5])
# print(list)
# list.appendleft(0)
# list.append(6)
# print(list)

# 결과 : deque([1, 2, 3, 4, 5]), deque([0, 1, 2, 3, 4, 5, 6])

# list.pop()
# list.popleft()
# print(list)

# 결과 : deque([1, 2, 3, 4, 5])
# # ---------------------------------------------------------------------------------------

# 해당 원소의 개수 카운트
# from collections import Counter

# counter = Counter(['blue', 'yellow', 'white', 'black', 'green', 'green', 'yellow', 'black', 'black', 'blue', 'white'])

# print(counter['blue'])
# print(counter['yellow'])
# print(dict(counter))

# 결과 : 2, 2, {'blue': 2, 'yellow': 2, 'white': 2, 'black': 3, 'green': 2}

# 문자열을 개수 카운트
# counter = Counter("hello world!")

# print(dict(counter))

# 결과 : {'h': 1, 'e': 1, 'l': 3, 'o': 2, ' ': 1, 'w': 1, 'r': 1, 'd': 1, '!': 1}
# # ---------------------------------------------------------------------------------------

# Counter를 이용한 가장 많은 요소 찾기
# from collections import Counter

# print(Counter("hello world").most_common())
# print(Counter("hello world").most_common(2))

# 결과 : [('l', 3), ('o', 2), ('h', 1), ('e', 1), (' ', 1), ('w', 1), ('r', 1), ('d', 1)], [('l', 3), ('o', 2)]
# # ---------------------------------------------------------------------------------------

# heapq(우선순위 큐 구현에 사용 / 힙 정렬), 평균 및 최악의 경우 시간 복잡도 : O(nlogN)
# import heapq
# def heapSort(iterable):
#     h=[]
#     result=[]
#     for value in iterable:
#         heapq.heappush(h, value)
#     for i in range(len(h)):
#         result.append(heapq.heappop(h))
#     return result

# result = heapSort([10, 2, 5, 23, 523, 24, 623, 52, 21, 11])
# print(result)

# 결과 : [2, 5, 10, 11, 21, 23, 24, 52, 523, 623]
# # ---------------------------------------------------------------------------------------

# bisect(이진 탐색을 기반으로 하며, 정렬된 시퀀스에서 해당 값이 들어갈 인덱스 번호를 찾는 데 사용), 평균 및 최악의 경우 시간 복잡도 : O(logN)

# from bisect import bisect_left, bisect_right

# li = [1, 2, 4, 5, 6, 6, 6, 6, 6, 6, 7, 8]
# n = 6

# print(bisect_left(li, n))
# print(bisect_right(li, n))

# 결과 : 4, 10
# # ---------------------------------------------------------------------------------------

# bisect을 사용한 특정 범위의 원소 개수를 구하는 예제
# from bisect import bisect_left, bisect_right

# def cnt_range(li, left, right):
#     return bisect_right(li, right) - bisect_left(li, left)

# li = [1, 2, 4, 4, 5, 6, 6, 6, 7, 8]
# print(cnt_range(li, 4, 4))
# print(cnt_range(li, 2, 7))

# 결과 : 4 - 2 = 2, 9 - 1 = 8
# # ---------------------------------------------------------------------------------------

# math 라이브러리

# import math

# print(math.factorial(3)) # 팩토리얼 계산
# print(int(math.sqrt(4))) # 루트 계산
# print(math.gcd(10, 20)) # 두 인수의 최대 공약수 계산
# print(math.floor(350.24)) # 내림 계산
# print(math.ceil(250.1)) # 올림 계산
# print(round(4.6)) # 반올림 계산

# 결과 : 6, 2, 10, 350, 251, 5
# # ---------------------------------------------------------------------------------------

# list comprehension
# a = [9, 7, 2, 1, 14, 24, 6, 2, 4, 7, 8, 10]

# result = [i for i in a if i > 5 and i < 10]
# print(result)

# 결과 : [9, 7, 6, 7, 8]

# result = [x**2 for x in range(1, 6)]
# print(result)

# 결과 : [1, 4, 9, 16, 25]

# result = [x * 2 for x in range(10) if x % 2 == 0]
# print(result)

# 결과 : [0, 4, 8, 12, 16]

# word = "chicken"
# result = [char for char in word]
# print(result)

# 결과 : ['c', 'h', 'i', 'c', 'k', 'e', 'n']
