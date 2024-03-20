# 백준 4153번 문제
# import sys

# while True:
#     a, b, c = map(int, sys.stdin.readline().rstrip().split())

#     if a == 0 and b == 0 and c == 0:
#         break
    
#     if (c**2 == (a**2 + b**2)) or (a**2 == (b**2 + c**2)) or (b**2 == (a**2 + c**2)):
#         print("right")
#     else:
#         print("wrong")

# -------------------------------------------------------------------------------------
# 위의 두 번째 if문 코드처럼 하나하나 모든 조건을 설정할 필요 없이, sort함수를 통해 오름차순으로 정렬하여 c만이 가장 큰 값으로 들어가게 만들면 좀 더 간편한 코드가 된다.

import sys

while True:
    arr = list(map(int, sys.stdin.readline().rstrip().split()))
    arr.sort()
    
    if arr == [0, 0, 0]:
        break

    if arr[2]**2 == arr[0]**2 + arr[1]**2:
        print("right")
    else:
        print("wrong")
     
    