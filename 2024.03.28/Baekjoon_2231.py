# 백준 2231번 문제
import sys

n = int(sys.stdin.readline().rstrip())

for i in range(1, n + 1):
    sep_i = sum(map(int, str(i)))
    constructor = i + sep_i

    if constructor == n:
        print(i)
        break
    if i == n:
        print(0)

# -------------------------------------------
# 위 문제를 풀 때 범위는 1부터 입력받은 n까지이다.
# 그래서 1부터 i와 그 자리 수를 더한 값을 n과 비교해가면서 값을 출력해야 한다.
# 먼저 자리 수 값을 구하는 방식은 기존에 쓰던 map함수에 sys 대신 i를 넣는데 문자열 입력받을 때와 마찬가지로 str로 형변환 해준 다음 넣어줘야 한다.
# 그렇게 i + sep_i를 구하면 생성자인지 아닌지를 판단할 수 있다. 그렇게 if문을 통해 비교하며 만약 맞으면 값을 출력하고 break한다. (해당 값 이외에도 다른 생성자가 있을 수도 있기 때문)
# 그리고 i값이 n과 같아졌다는 것은 생성자가 없다는 뜻이므로 0을 출력한다.