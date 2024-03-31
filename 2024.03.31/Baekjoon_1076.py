# 백준 1076번 문제
import sys

temp = ['black', 'brown', 'red', 'orange', 'yellow', 'green', 'blue', 'violet', 'grey', 'white']
temp2 = [1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000]

one = sys.stdin.readline().rstrip()
two = sys.stdin.readline().rstrip()
three = sys.stdin.readline().rstrip()

value = int(str(temp.index(one)) + str(temp.index(two)))
result = value * temp2[temp.index(three)]
print(result)

# ----------------------------------------------------------------------------------------------
# temp의 경우, 인덱스 대신 dictionary 형태로 만들어서 풀고 temp2의 경우 10의 거듭제곱들 이므로 굳이 배열을 만들지 않아도 됌