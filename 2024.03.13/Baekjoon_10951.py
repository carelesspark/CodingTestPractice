# 백준 10951번 문제

temp = []
count = 0

while True:
    try:
        a, b = map(int, input().split())
        sum = a + b
        temp.append(sum)
        count += 1
    except:
        for i in range(count):
            print(temp[i])
        break

# 10951번 문제를 풀면서 알게 된 점은 2가지다.
# 첫 번째로 만약 조건이 없이 입력/출력이 이루어져있다면 예외가 발생했을 경우에 출력을 마무리하라는 뜻으로, 이때는 try/except 구문을 사용해야 한다.
# 두 번째로 except 구문을 사용했더라도 while은 끝나지 않으므로 반드시 for문 사용 후 break를 붙여주어야 한다.