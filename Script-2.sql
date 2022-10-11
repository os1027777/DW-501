셀렉트 조회
셀렉트 = 컬럼이름 프롬은 테이블 이름

프롬 웨얼 그룹 바이 해빙 셀렉트 오덜바이

INSERT 입력(추가)
INSERT INTO 테이블 이름(컬럼이름) VALUES 데이터

UPDATE 수정
SET 컬럼이름 = 데이터
데이터 베이스는 업데이트를 받으면 델리트 했다

DELETE 삭제 
 
SELECT Deptno FROM 

-- 두 테이블간 공통된 데이터 (교집합)이 있다면 조인가능
-- 조인은 2개이상 테이블을 조회할때 사용
-- * = all을 의미
-- 별칭 = AS
SELECT  *FROM emp AS e
INNER JOIN dept AS d 
ON e.DEPTNO = d.DEPTNO

-- 부서번호가 10 번인 사원들의 이름 입사날짜
-- 부서이름 조회
SELECT
	e.ENAME,
	e.HIREDATE,
	d.dname
FROM emp AS e
INNER JOIN dept AS d
ON e.DEPTNO = d.DEPTNO
WHERE e.DEPTNO = 10

SELECT
e.empno,d.loc
FROM emp AS e
INNER JOIN dept AS d 
ON e.DEPTNO =d.DEPTNO WHERE e.job = 'MANAGER'

SELECT
e.empno,
e.ename,
e.DEPTNO
d.dname

FROM emp AS e
INNER JOIN dept AS d
ON e.empno = d.DEPTNO
WHERE e.sal = 2000

