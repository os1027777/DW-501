#set
#리스트와 달리 순서없이 , 중복없이 사용
#순서가 없다라는 말은 입력한 순서대로 저장되있지 않는다
#중복 제거가 필요한 경우에 사용
#그룹 구성할때 사용(집합)
#데이터를 변셩할수 없지만 데이터를 제거하고 새 데이터 추가할수 있다
#set은 { } 로 작성 된다

#set 생성

set1 = {"사과","배","포도","배"}
print(set1)

set2 = set("member")
print(set2)

set3 = set("장영죽이가 죽을 먹었다. 근데 장영죽이가 죽을 먹다가 토했다 ")
print(set3)

set4 = set(("장영실이","수도원옷을","입었다"))
print(set4)

#print(set4[0]) 인덱스를 사용하여 set 데이터 접글 불가

for s in set4:
    print(s)

print("장영주가" in set4) # set 내부에 데이터가 있는지 확인

#set에 데이터 푸가 하기
set4.add("짐진연음")
print(set4)

set5={"안녁을 쓰고있다","그래서","불편하다"}
set4.update(set5)
print(set5)
list1=["장영주는","화가앖다."]
set4.update(list1) #리스트 뿐만 아니라 튜플 ,딕셔너리 도 가능
print(set4)


#set 데이터 삭제
set4.remove("그래서") #remove는 삭제 데이터가 없으면 오류발생
print(set4)
set4.discard("장영주는") #discard는 삭제데이터가 없으면 오류 no
print(set4)
a = set4.pop() # 마지막 데이터를 추출 , 삭제
print(set4)
print(a)
set4.clear() # set을 비움
del set4 # set을 완전히 삭제


#집합
장영주팀 = {"기무기원","김민서","김민정","치윤도","정다현","임서민","이지현","이좀문"}
김지연팀 = {"윤재영","이정수","윤종찬","변수정","치윤도","전계림","연하남친","이지현" }

a = 장영주팀 - 김지연팀 #차집합
print(a)
b = 장영주팀 | 김지연팀 #합집합   | = 더하기?
print(b)
c = 김지연팀 & 장영주팀 #교집합
print(c)
d = 김지연팀 ^ 장영주팀 #합집합에서 교집합 뺴기
print(d)














