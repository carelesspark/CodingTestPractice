# 백준 9498번 문제

# a = map(int, input().split())
# score = list(a)
# if score[0] >= 0 and score[0] <= 100:
#     if score[0] >= 90 and score[0] <= 100:
#         print("A")
#     elif score[0] >= 80 and score[0] <= 89:
#         print("B")
#     elif score[0] >= 70 and score[0] <= 79:
#         print("C")
#     elif score[0] >= 60 and score[0] <= 69:
#         print("D")
#     else:
#         print("F")


# -----------------------------------------------------------------
# 처음에는 위의 코드로 제출하였는데, 생각해보니 값을 하나만 입력받기 때문에 split을 사용할 필요가 없음
# 그래서 map함수를 사용하는 대신, input()함수 만을 사용하면서 int로 형변환 해주는 방식으로 코드를 재작성함

score = int(input())
if score >= 0 and score <= 100:
    if score >= 90 and score <= 100:
        print("A")
    elif score >= 80 and score <= 89:
        print("B")
    elif score >= 70 and score <= 79:
        print("C")
    elif score >= 60 and score <= 69:
        print("D")
    else:
        print("F")
