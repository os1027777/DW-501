SELECT count(*) FROM emp WHERE job = 'MANAGER'

select count(*) AS " 모든 사원수",
(
select count(*) AS "사원수" FROM emp WHERE job = 'MANAGER' 
) AS "메니저 사원수"
FROM emp 

select count(*) AS " 모든 사원수",
(
select count(*) AS "사원수" FROM emp WHERE job = 'clerk'
) AS "메니저 사원수"
FROM emp  WHERE mgr IS NOT NULL

-- 프롬절에 오는 서브쿼리를 인라인 뷰(가상 테이블) 라고 부른다
-- from 절에 오는 서브쿼리는 WHERE 절 처럼 필터링 할때 사용한다.
-- 프롬절에 오는 서브 쿼리는 웨얼 절 처럼 필터링 할때 사용한다
-- 서브쿼리 실행후 매인쿼리 실행한다
SELECT 
e.DEPTNO
from(SELECT DEPtno  FROM emp GROUP BY DEPTNO HAVING  count(*) >4 ) AS sub
INNER JOIN emp AS e 
ON sub.deptno = e.DEPTNO

SELECT 
*
FROM emp WHERE DEPTNO != 10

-- 웨얼 절에오는 서브쿼리를 중첩쿼리라고 부른다 
-- 서브쿼리 중에 사용률이 매우 낮음
SELECT * FROM emp WHERE empno in (SELECT empno FROM emp WHERE mgr IS null)

INSERT INTO emp (empno , ename) values(1,"홍길동")


-- not null 이 설정되어 있다면 무조건 무조건 입력해야한다
INSERT INTO emp (empno) values(2);

-- PRI 는 PRIMATY KEY 의 줄임말로 PK라고 부른다
-- PK 는 데이터가 중복해서 들어오는걸 막는다
-- PRIMARY KEY는 DEFAULT값이 NOT NULL이다





















