# 백준 13458번 문제
import sys

room = int(sys.stdin.readline().rstrip())

students = list(map(int, sys.stdin.readline().rstrip().split()))

m_supervisor, s_supervisor = map(int, sys.stdin.readline().rstrip().split())

need_supervisor = room

for student in students:
    student -= m_supervisor
    if student > 0:
        need_supervisor += student // s_supervisor
        if student % s_supervisor > 0:
            need_supervisor += 1

print(need_supervisor)