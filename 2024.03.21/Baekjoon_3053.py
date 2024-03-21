# 백준 3053번 문제
import sys, math

r = int(sys.stdin.readline().rstrip())

print(math.pi * r**2)
print(r**2 * 2)

# --------------------------------------
# 소수점 6자리 포함

print(f'{math.pi * r**2:.6f}')
print(f'{r**2 * 2:.6f}')