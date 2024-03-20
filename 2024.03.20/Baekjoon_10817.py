# 백준 10817번 문제
# import sys

# arr = list(map(int, sys.stdin.readline().rstrip().split()))

# top = max(arr)
# bottom = min(arr)

# arr.remove(top)
# arr.remove(bottom)
# print(arr[0])

# ----------------------------------------------------------------
# 위 방법 처럼 삭제하는 것도 있지만 sort해서 가운데 값을 출력하면 됌
import sys

arr = list(map(int, sys.stdin.readline().rstrip().split()))

arr.sort()
print(arr[1])