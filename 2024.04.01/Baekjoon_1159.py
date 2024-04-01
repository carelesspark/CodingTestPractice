# 백준 1159번 문제
import sys

case = int(sys.stdin.readline().rstrip())

temp = []
temp2 = []


for i in range(case):
    name = sys.stdin.readline().rstrip()

    temp.append(name[0])

temp.sort()

for i in range(97, 123):
    if temp.count(chr(i)) >= 5:
        temp2.append(chr(i))

if len(temp2) == 0:
    print("PREDAJA")
else:
    for i in temp2:
        print(i, end="")


