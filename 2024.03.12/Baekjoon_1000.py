a, b = map(int, input().split()) # input()으로 값을 입력받고, split()을 통해 입력받은 값의 공백을 기준으로 리스트 생성(1 2를 입력하면 ["1", "2"] 리스트 생성)
# map 함수를 사용해서 리스트 내의 원소에 int 적용, 그렇게 적용된 원소들은 각각 a와 b에 대입

print(a + b) # 저장된 a와 b를 덧셈

# map : 여러 값을 한번에 처리하거나 변환할 때 사용하는 내장 함수, 주어진 함수를 각 요소에 적용하여 새로운 iterable 생성
# 예시) result = map(function, iterable)
# function = 각 요소에 적용될 함수 
# iterable = 함수에 적용 될 요소들의 시퀀스
