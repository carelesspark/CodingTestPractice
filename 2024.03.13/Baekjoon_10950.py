# 백준 10950번 문제

count = int(input())

temp = []

for i in range(count):
    a, b = map(int, input().split())
    sum = a + b
    temp.append(sum)

for i in range(count):
    print(temp[i])

# 배열의 크기를 동적으로 조절하려면 append함수 사용하기