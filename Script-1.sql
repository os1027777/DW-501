SELECT : 컬럼
FROM 테이블 이름
WHERE 필터링

그룹핑, 정렬   그룹핑 필터링

-- 정렬 ORDER BY
-- DESC 내림차순 , ASC 오름차순
-- ORDER by에 DEFAULT 정렬은 오름차순

 -- 실행순서 from > WHERE > SELECT > ORDER by
SELECT ename, sal FROM emp
ORDER BY SAL

-- ORDER by 작성시 컬럼위치를 쓰지 않고 컬럼 이름을 작성하자!
SELECT ename, HIREDATE  FROM emp ORDER BY HIREDATE DESC

-- 이름검색 like 이용하여 이름에 a 가 한번이라도 들어간 사원
SELECT ename FROM emp WHERE ename LIKE "%A%"

SELECT ename FROM emp WHERE ename LIKE "A%"

-- 값이 널인 컬럼 조회할때 사용 is null

SELECT comm FROM emp WHERE comm IS null

SELECT comm FROM emp WHERE comm IS not NULL

--ifnull() : null인 컬럼을 임시로 다른 데이터로 채워줌 
SELECT ifnull(comm,0) FROM emp

-- group by
SELECT job, count(*) FROM emp GROUP BY JOB

SELECT DEPTNO ,max(sal)  FROM emp GROUP BY DEPTNO 

SELECT DEPTNO ,avg(sal)  FROM emp GROUP BY DEPTNO ORDER BY avg(sal)

-- where 조건에는 더하기 평균 최대값 같은 함수를 사용할수없다
SELECT job, sum(sal) FROM emp GROUP BY job HAVING sum(sal) >= 5000


-- from > WHERE > GROUP by > HAVING > select > order by 
SELECT job, avg(sal) FROM emp
WHERE job = 'MANAGER'
GROUP BY job
HAVING avg(sal) >=2000
ORDER BY avg(sal) DESC


SELECT job,ename,sal FROM emp WHERE job = 'MANAGER' or job = 'SALESMAN'  ORDER BY sal desc

select comm,ename FROM emp GROUP BY comm HAVING COMM >=1

SELECT empno ,ename,job FROM emp WHERE ename LIKE "%A%"

SELECT DEPTNO  ,max(sal),min(sal), count(*) FROM emp

SELECT job ,avg(sal)  FROM emp GROUP BY job

SELECT DEPTNO, sum(sal) FROM emp WHERE DEPTNO = 10 GROUP BY DEPTNO

SELECT DEPTNO,sum(sal) FROM emp  GROUP BY DEPTNO HAVING sum(sal) >=5000

SELECT date_format(hiredate,"%Y") , count(*) FROM emp GROUP BY HIREDATE








