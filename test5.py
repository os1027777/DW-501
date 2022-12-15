# city = ("서울","대전","대구","광주","부산","울산","세종")

# b = ("신생아","초등학생","중학생","고등학생","대학생","노년층")

# import random
# val = dict()
# valuse = list()
# for k in city : # 도시수 만큼 입력하기
#    lis = dict()
#    print("==={0}지역 인구수===".format(k))
#    for i in b :
#     q =random.randint(1000,3000)
#     print("{0}:{1}명".format(i,q))
#     lis[b] = q # 신생아 , 초등학생 , 중학생.. 인구수를 딕셔너리에 저장
#     # 키 , 신생아, 초딩 ,중딩 value 인구수 
#     val[k] = lis #위에서 만들어진 딕셔너리를 value로 , 도시이름은 key
# for i in val :
#     print("{0} : {1}".format(i,val))

    #함수 
    #자바의 메서드
    #반환타입 메서드 이동(매개변수){메서드 실행내용; 반환타입 이다면 리턴 }
    #자바스크립트 함수
    #펑션 함수이름(매개변수){함수내용 ; 반환값 이다면 리턴}

    #파이썬 함수
    # def 함수이름 (매개변수):

    #정의된 함수 실행방법 > 함수이름()

#     def sum(a,b):
#         return a+b
# res = sum(10,20)
# print(res)

# def func1(word):
#     print(word +"이다")

# func1("난바보")

# def minus(num1,num2):
#     print(num1-num2)

# minus(30,15)

# def whoami(name, what):
#     if name =="장영주":
#         print(name+"는"+what+"가 아니다")
#     else:
#         print(name+"는"+what+"이다")

# whoami("장영주","바보")
# whoami("김지연","바보")

# def count(i):
#     return i+1
# cnt=0
# while cnt<10 :
#     cnt = count(cnt)

# print(cnt)

# cnt1 = 0 #전역변수 count2 보다 먼저 생성한다,

# def count2():
#     global cnt1 #파이썬의 전역변수 - count2 함수에서 cnt1 을 사용하고자 한다면 global 붙여서
#     cnt1+=1      #  전역변수임을 알려주고 사용한다
#                 #전역변수는 최소함으로만 사용 - 코드의 유지보수를 어렵게한다
#                 #전역변수를 마구 생성하면 내가 코드보기가 어렵다
# while cnt1<10:
#     count2()
# print(cnt1)



# def count(a): #100이 증가하는 함수 정의 지정된 값 100증가해야 하니까 매개변수 필요
#    print(a+100) # 100증가 시키고 출력하기

# d= int(input("정수입력"))  # 정수입력받기
# count(d) # 100증가 시켜주는 함수 호출하여 입력받은 숫자를 함수에 넘겨주기




# def count(a,b):
#     print(a*b)

# in1= int(input("정수입력1")) 
# in2= int(input("정수입력2")) 

# count(in1,in2)


for i in range(1,50):
    def count(i):
        return i+1
    if i%2 ==0 :
        print(i)
z = list()
count(z)

def add1(n):
    print(n+1)
    


