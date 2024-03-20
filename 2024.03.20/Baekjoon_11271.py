# 백준 11721번 문제
# import sys

# word = sys.stdin.readline().rstrip()

# n = 0

# for i in range(len(word)):
#     print(word[i], end="")
#     n+=1
#     if n % 10 == 0:
#         print()

# -----------------------------------------
# 위보다 더 짧은 코드는 for문의 특성을 이용하는 것이다.
import sys

word = sys.stdin.readline().rstrip()

for i in range(0, len(word), 10):
    print(word[i:i+10])

# for문을 0~에서 word의 크기만큼 반복하는데, 한 번 돌때마다 10씩 증가되게 만든다 <- for문안에서 print를 할 경우, 인덱스가 10인 글자부터 다음 줄에 출력됌
# 그렇게 print안에는 word의 인덱스 0부터 9번까지를 출력하는 i:i+10을 작성