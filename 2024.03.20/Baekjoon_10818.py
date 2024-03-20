# 백준 10818번 문제
# import sys

# amount = int(sys.stdin.readline().rstrip())
# arr = list(map(int, sys.stdin.readline().rstrip().split()))

# temp1 = arr[0]
# temp2 = arr[0]

# for i in arr:
#     if temp1 < i:
#         temp1 = i

# for i in arr:
#     if temp2 > i:
#         temp2 = i
# print(temp2, temp1, end=" ")

# --------------------------------------------------------------
import sys

amount = int(sys.stdin.readline().rstrip())
arr = list(map(int, sys.stdin.readline().rstrip().split()))

print(min(arr), max(arr))
# 배열에는 max, min이 적용 안되는 줄 알고 식을 만들었는데, min&max 적용이 된다..