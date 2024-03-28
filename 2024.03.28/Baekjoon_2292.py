# 백준 2292번 문제
import sys

room = int(sys.stdin.readline().rstrip())
room_range = 1
count = 1

while room > room_range:
    room_range += 6 * count
    count += 1

print(count)

# -----------------------------------------------
# 그림을 자세히 보면 범위의 끝 번호가 1 - 7 - 19 - 37 - 61 .... 으로 진행되는 것을 확인할 수 있고
# 각 번호에 6의 배수가 더해지는 규칙을 찾을 수 있음

# 따라서 주어진 room 번호가 범위의 끝보다 큰지 확인하기 위해 while문을 이용하고, 만약 room번호가 클 경우 범위에 6 * count로 더해줌과 동시에 지나가는 count의 값 또한 1 증가시켜야 함
# 그렇게 해서 범위 안에 room번호가 있을 경우, count 값이 문제에서 원하는 얼마나 지나는지에 대한 답을 얻을 수 있음