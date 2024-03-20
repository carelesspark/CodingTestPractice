# 백준 2884번 문제
import sys

h, m = map(int, sys.stdin.readline().rstrip().split())

if m < 45:
    if h == 0:
        temp = m - 45
        m = 60 - abs(temp)
        h = 23
        print(h, m, end=" ")
    else:
        temp = m - 45
        m = 60 - abs(temp)
        h = h - 1
        print(h, m, end=" ")
else:
    print(h, (m - 45), end=" ")

# ----------------------------------------------------------
# 더 짧은 코딩
H, M = map(int, input().split())

if M < 45 :
    if H == 0:
        H = 23
        M += 60
    else :
        H -= 1	
        M += 60
        
print(H, M-45)
# temp를 사용할 필요가 없고, 45보다 작으면 미리 60을 더해주고 -45를 하면 똑같은 값이 나옴.
# 그렇기에 print()역시 일일이 써줄 필요가 없음