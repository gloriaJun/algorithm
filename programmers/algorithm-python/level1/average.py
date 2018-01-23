'''
def average(list):
함수를 완성해서 매개변수 list의 평균값을 return하도록 만들어 보세요.
어떠한 크기의 list가 와도 평균값을 구할 수 있어야 합니다.
'''


def average(list):
  if (len(list) == 0):
    return 0
  return sum(list, 0.0) / len(list)

list = [1, 4, 5]
print("평균값 : {}".format(average(list)))