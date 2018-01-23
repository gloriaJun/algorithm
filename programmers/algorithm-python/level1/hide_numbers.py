import sys

def hide_numbers(s):
	n = s[0:-4]
	return s.replace(n, '*' * len(n))
	
print("결과 : " + hide_numbers('01033334444'));
