"""
# x =9

# print("aa" + str(x))


# print("aa{0}".format(x) )

# a = 3.14 
# print("float : {0}".format(a))
# print("float : {0:.1f}".format(a))

# print(type(a))

# name=" 이정수"
# print("이름{0:s}".format(name))
# print(name)
# memo="어쩌고 저쩌고"

# result = name+memo
# print(result)
# res_len = len(result)
# print(res_len)

# temp1 = result.split()
# print(temp1)
# temp2 = result.split(" ", 1)
# print(temp2)
"""
# print("{0}".format(",".join(temp1)))
# #join은 문자열 배열을 합친다  "%".join(배열) 을 한다면 각 배열의 요소사이에 %가 붙은 상태로 합쳐진다
# """ 이것도 주석 """
"""
# num = int( input("숫자를 입력")) #input은 입력 함수이다 , 결과는 문자열로 반환한다.
# print(type(num))


# #정수타입 변환 int()
# #실수타입 변환 float()
# #문자열 타입 변환 str()
# n = 0
# a =  int(input("국어"))
# b =  int(input("수학"))
# c =  int(input("영어"))

# n +=  a + b + c
# d = n/3

# print(d)
#  #출력 프린트()
#  #입력 인풋()
#  #변수  = 그냥 타입 없이 변수만
#  #타입변환 str() 문자열    int()정수    float()실수
 


# v = int(input("속도"))
# r= int(input("반지름"))

# dist = r*2*3.14
# time = dist/v*60
# print(time)






# s = int(input("몇잔"))
# lise = s*2*365*20
# print(lise)

# print(int(lise/60))
# print(lise/60/24)





# x,w,t = "김징","짐","임"
# a=d=w = "아아앙"

# favorite = ["목","ㅇ","ㅎ"] #리스트 

# a,w,t = favorite
# print(a)
# print(w)
# print(t)

# num = 19
# num1 = 23

# if num > num1 :
#     print("이겼다")
# else :
#     print("졌다")



# if num == 0:
#     print("안녕")


# r= int(input("기원"))
# a= int(input("지연"))

# if r>a :
#     print("기원승")
# else :
#     print("지연승")
    
# ㅁ= int(input("영주"))
# if ㅁ>=90 :
#     print("a")
# elif ㅁ>=80 :
#     print("b")
# elif ㅁ >= 70:
#     print("c")
# else :
#     print("ㅉㅉ")

# ㅇ= int(input("지연"))
# if ㅇ>=90 :
#     print("a")
# elif ㅇ>=80 :
#     print("b")
# elif ㅇ >= 70:
#     print("c")
# else :
#     print("ㅉㅉ")

# ㄴ= int(input("수정"))
# if ㄴ>=90 :
#     print("a")
# elif ㄴ>=80 :
#     print("b")
# elif ㄴ >= 70:
#     print("c")
# else :
#     print("ㅉㅉ")
# r = ㅁ+ㅇ+ㄴ
# a = r/3
# print(a)

# i=1
# while i<=9:
#     print ("연산"+str(i)+"연산중"+ str(4*i))
#     i+= 1

# i=1
# while True :
#     print(i)
#     if i == 100:break
#     i+=1
 

# i=1200
# c = 10000
# z=0
# while c>=i: c-=i  
# z += 1 
# else :
# print(c,i)

# 
# for i in range(1,10,3):
#     print(i)

# for i in range(1,10):
#     print("8*{0}={1}".format(i,8*i))

# for i in range(45,110):
  
#     print(i)



# for i in range(1,101) :
#     if i%3 == 0 :
#         print("윤재영",end="")
#     if i%5 == 0 :
#         print("바봅")

#파이썬 데이터 타입 
# 리스트 , 튜플 , 딕셔너리 , 셋 , 배열

# name = [" 장영주 바보","장영주","영주"]
# print(name)

# data2 = list(("초운도서관", "변수정", 100))
# print(data2)

# print(data2[0])


# data3=["이정빈티지","윤종찬양하라","이지현미밥맛있어","장영주모"]
# print(data3[1:3])
# print(data3[:3])
# print(data3[2:])

# data3.append("김짖연")
# data3.append("윤재영")
# print(data3)

# #데이터 지우기
# data3.remove("장영주모")
# print(data3)

# data3.pop()
# print(data3)#마지막 데이터를 삭제

# del data3[2]#인덱스를 통해 삭제
# print(data3)

# data3.clear()# 리스트 완전삭제
# print(data3)

# memo = ["나","김지언","은","18세남"]
# for me in memo:
#     print(me,end=" ")

#     memo[3] = "30세 남친을"
#     print()
# for me in memo:
#     print(me,end="")
    
#     memo[1:4] = ["자여영주","는","목발을"]
#     print()
#     for me in memo:
#         print(me,end="")

# memo.insert(3,"드러운")

# print(memo)

# memo1 = ["이종빈","윤제형","변수정"]
# memo2 = ["영영주무","김지언세먼","이지현ㅇ머"]
# memo1.extend(memo2)
# print(memo1)

# print(len(memo1))

#리스트 생성
#1. memo = ["a","c","d"]
#2. memo = list["d","d","d"]
#3. 데이터 추가 memo.appnd

#리스트 크기 len()
#갯수 구하기 memo.count("장") - 장이라는 데이터 몇개있냐
#인덱스 찾기 memo.index("영") 영이라는 데이터는 몇번째 인덱스이냐
#정렬 memo.sort() 오름차순 . memo.sort(reverse=True) 내림차순
#반전 memo.reverse()
"""





    










































































































