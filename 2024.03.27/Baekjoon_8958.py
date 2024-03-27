# 백준 8958번 문제
import sys

count = int(sys.stdin.readline().rstrip())

for i in range(count):
    result = sys.stdin.readline().rstrip()

    score = 0
    total = 0   
    
    for j in result:
        if j == 'O':
            score += 1
            total += score
        else:
            score = 0
    print(total)
          
       
        
# -----------------------------------------
# 위 문제의 풀이 방식은 입력받은 OX의 값을 for문으로 한 글자씩 가져온다.
# 이때 변수 2가지를 선언하는데 연속되는 O의 점수를 위한 score변수와 score를 더하고 저장할 total변수를 선언한다.
# 그래서 한 글자씩 비교하면서 O이면 score에 1을 더해주고 이 1을 total에 저장한다.
# 만약 두 번째 글자 역시 O일 경우, O가 연속되기에 score의 값이 1이 더 증가 되어 2가되고 이를 total에 저장한다. 그러나 X가 나올 경우에는 다음 O일 때 보너스 점수가 들어가면 안되므로
# score의 변수 값을 초기화했다.
# 위의 방식으로 연속되는 값에 의한 보너스 점수 계산을 할 수 있다.

    

        