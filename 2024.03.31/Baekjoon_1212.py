# 백준 1212번 문제
import sys

num = int(sys.stdin.readline().rstrip(), 8)
result = bin(num)

print(result[2:])

# ---------------------------------------------
# 먼저 8진수 -> 2진수이기 때문에 sys를 통해 값을 입력받을 때, int로 묶어주는데 8진수로 변환해야 하기 때문에 인수로 8을 같이 작성한다.
# 그리고 bin이라는 2진수로 변환해주는 함수를 통해 변환하는데, 이때 앞에 0b가 붙는다. 
# 그렇기에 0b를 제외하고 출력하기 위해 [2:]로 인덱스 2번부터 출력하게 만든다.