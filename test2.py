import random

# num = random.randint(all)

# print(num)

# firstname = ["김","하","명","호","박","성","윤"]
# middle = ["가","윤","항","송","교","영","명","추"]
# last = ["해","지","시","팔","하","인","중","호","멍","버","지"]

# a = random.choice( firstname)
# b = random.choice( middle)
# c = random.choice( last)
# print(a,b,c)

# info = [ ["김기원","콘셀러드","시험"],["이지현","나이","민감"],["김지연","어쩌고","구구구"],["강균성","배운","안녕"] ]

# 특징 = input("입력")
# for 개인  in info:
#     for 특징 in 개인 :
#         print(개인[0])

# info = [["김민서","군인"12],["김기원","콘셀러드",32],["이지현","나이",42],["김지연","어쩌고",13],["강균성","배운",42] ]

""" name = ["이정수","차동준","김윤석","박진원"]
job = ["군인","국회의원","재수생","도둑","벨리댄서","홍길동","과학자"]
age = [20,30,40,50,10,60,70]

#인포 배열 생성
info = []
#랜덤값 배열 생성
for i in range(10) :
    #피폴
    info.append([random.choice(name), random.choice(job), random.choice(age)])
#피폴 생성 후 군인과 피폴 대조
for people in info:
    if "군인" in people:
        #0번째 배열이름 출력(name)
        print(people[0])
#변수생성
age = 0
cont=0
#피폴과 과학자 대조
for people in info:
    if "과학자" in people:
    #나이에 2번째 배열 추가(job)
        age+= people[2]
        #폴문이 돌때마다 카운트에 1플러스 
        cont+=1
        #0이 아닐때 출력
    if cont!=0:
        print("과학자퍙균" , str(age/cont))
    else :
        #0이라면 출력
        print("과학자 없다")

for people in info:
    if int(int(people[2])/10) ==2:
        print(people[1])


#랜덤 사용방법
# random.randint(1,40) -> 1~40중에서 랜덤
a=[]# 랜덤범위 1~20
b=[]# 랜덤범위 10~50
c=[]# 랜덤범위 1~100

num=[]
random.randint(15)
for i in range(30) :
    a.append(random.randint(1,20))
    a.append(random.randint(10,50))
    a.append(random.randint(1,100))
for x in a:# a 리스트의 값을 하나씩 하나씩 x 변수에 저장해준다
    if x in b:# x 변수의 값이 리스트 b에 있나 확인해준다
        if x in c:# x 변수의 값이 리스트 b 에슨ㄴ 있는데 리스트 c 에도 있나 확인해준다
            num.append(x)
if len(num) !=0: # len(num) -> 리스트의 크기값 0 이라면 없다. , not num -> num이 비였다면 false
    print(num)
else :
    print("넘이 비였다")
 """




word=["boy","table","book","girl","interest","limit","endless","mission","hopi","tigerprint"]
eng = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]



comb = ""
con = 0
while True :
    con+=1 
    g = random.randint(3,10) 
    for i in range(g) :
        if(random.choice(g)) :
            comb += random.choice(eng)
            print(comb)
        if con in word :
            break
    print(g +"d"+int(comb))