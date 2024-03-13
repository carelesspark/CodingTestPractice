# 백준 10952번 문제

temp = []
count = 0

while True:
    a, b = map(int, input().split())
    if a == 0 and b == 0:
        break

    sum = a + b
    temp.append(sum)
    count += 1

for i in range(count):
    print(temp[i])