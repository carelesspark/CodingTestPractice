# 백준 1547번 문제
# import sys

# ball = [1, 0, 0]

# count = int(sys.stdin.readline().rstrip())

# for i in range(count):
#     cup1, cup2 = map(int, sys.stdin.readline().rstrip().split())

#     temp = ball[cup1 - 1] 
#     ball[cup1 - 1] = ball[cup2- 1]
#     ball[cup2 - 1] = temp

# print(ball.index(1) + 1)

# -----------------------------------------------------------------
# 문제에는 ball이 1번 컵 자리에 그대로 있음을 알려줬기에 사실 ball 배열이 아닌 cup 배열 [1, 2, 3]을 이용해 푸는 것이 좋다.
