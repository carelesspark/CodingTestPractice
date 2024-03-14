# 백준 5597번 문제
import sys

temp = []
err = 0

for i in range(28):
    num = int(sys.stdin.readline())
    temp.append(num)
    
for j in range(1, 31):
    if j not in temp:
        print(j)


# -------------------------------------------------------------
# 5597번 문제는 여러 값을 한번에 받는 게 아닌, 하나씩 받는 문제이므로 map 사용이 필요 없음!!
# not in으로 배열에 해당 값이 있는지 구분할 수 있음!!
