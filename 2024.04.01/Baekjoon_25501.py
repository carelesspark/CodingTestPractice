# 백준 25501번 문제
import sys

case = int(sys.stdin.readline().rstrip())

def recursion(s, l, r, count):
    
    count += 1

    if l >= r:
        return [1, count]
    elif s[l] != s[r]:
        return [0, count]
    else:
        return recursion(s, l + 1, r - 1, count)

def isPalindrome(s):
    count = 0

    return recursion(s, 0, len(s) - 1, count)

for i in range(case):
    palindrome = sys.stdin.readline().rstrip()

    value, call = isPalindrome(palindrome)
    print(value, call)

