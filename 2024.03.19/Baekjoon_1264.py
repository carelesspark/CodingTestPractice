# 백준 1264번 문제
# import sys

# while True:
#     sentence = sys.stdin.readline().rstrip()

#     if sentence == '#':
#         break

#     count_lower = sentence.count('a') + sentence.count('e') + sentence.count('i') + sentence.count('o') + sentence.count('u')
#     count_upper = sentence.count('A') + sentence.count('E') + sentence.count('I') + sentence.count('O') + sentence.count('U')
#     count = count_lower + count_upper
#     print(count)

# --------------------------------------------------------------------------------------------------------------------------
# 리스트로 푸는 방법도 있음
import sys

collection = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']

while True:
    sentence = sys.stdin.readline().rstrip()
    count = 0

    if sentence == '#':
        break
    for i in sentence:
        if i in collection:
            count += 1
    print(count)

# 아래의 방법이 더 간편해보임

    