# 백준 11719번 문제
while True:
    try:
        print(input())
    except EOFError:
        break

# ------------------------
# 위 문제는 입력받은 그대로를 출력하는 문제인데, 함정은 입력의 끝이 명시되어 있지 않기 때문에 처리하는 방법을 물어보는 문제다.
# 여기에는 input과 readline이 있는데, input의 경우 try/exception문을 통해 break을 하면 되지만, 
# 기존에 사용하던 sys.stdin.readline()의 경우 한 줄이 더 출력되어 출력 초과가 발생한다.
# 그렇기에 이럴때는 readline 대신 전체 데이터를 한 번에 읽는 read()함수를 사용한다.