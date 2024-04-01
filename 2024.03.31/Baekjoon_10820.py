# 백준 10820번 문제
import sys

while True:
    sentence = sys.stdin.readline().rstrip("\n")

    if not sentence:
        break

    small, big, blank, num = 0, 0, 0, 0

    for i in sentence:
        if i.islower():
            small += 1
        elif i.isupper():
            big += 1
        elif i.isdigit():
            num += 1
        elif i.isspace():
            blank += 1

    print(small, big, num, blank)

# ----------------------------------------------------
# n이 주어지지 않았을 경우, 위 처럼 입력받은 값이 없을 경우 break 하는 if not ~ 을 사용하거나 혹은 try/except문 사용하기