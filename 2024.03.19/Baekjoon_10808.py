# 백준 10808번 문제
import sys
text = sys.stdin.readline().rstrip()
temp = [0] * 26

print(temp)

for i in text:
    temp[ord(i) - 97] += 1

for i in range(len(temp)):
    print(temp[i], end=" ")

# ----------------------------------------------------------------------------------------
# 알파벳 문제는 아스키코드로 푸는 것이 좋을 듯
# 전체 알파벳의 크기는 26, ord(단어 중 한 글자) - 97에서 97을 마이너스한 이유는 아스키 코드 값에서 97~122까지가 알파벳 소문자 번호이기 때문이다.
# 그래서 a일 경우 배열의 인덱스 번호가 0이며 해당 인덱스 값이 +1 되어 문제가 원하는 답인 해당 알파벳 개수를 나타낼 수 있다.