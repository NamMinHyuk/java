DROP TABLE X;
DROP TABLE S;
DROP TABLE M;
CREATE TABLE M
(M1 CHAR(6), M2 VARCHAR(10));
CREATE TABLE S
(S1 CHAR(6), S2 VARCHAR(10));
CREATE TABLE X
(X1 CHAR(6), X2 VARCHAR(10));


INSERT INTO M VALUES('A','1');
INSERT INTO M VALUES('B','1');
INSERT INTO M VALUES('C','3');
INSERT INTO M VALUES(NULL, '3');

INSERT INTO S VALUES('A','X');
INSERT INTO S VALUES('B','Y');
INSERT INTO S VALUES(NULL, 'Z');

INSERT INTO X VALUES('A','DATA');

SELECT * FROM S;
SELECT * FROM M;
SELECT * FROM X;

SELECT * FROM M JOIN S ON M1 = S1;

SELECT * FROM M CROSS JOIN S;
SELECT * FROM M,S;

SELECT * FROM M LEFT OUTER JOIN S ON M1 = S1;
SELECT * FROM M,S WHERE M1 = S1(+);

SELECT * FROM M RIGHT OUTER JOIN S ON M1 = S1;
SELECT * FROM M,S WHERE M1(+) = S1;

SELECT ENAME, SAL, GRADE
FROM EMP JOIN SALGRADE ON (SAL BETWEEN LOSAL AND HISAL);

SELECT E.ENAME, E.SAL, S.GRADE
FROM EMP E, SALGRADE S
WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;

SELECT 사원.EMPNO, 사원.ENAME, 관리자.EMPNO, 관리자.ENAME
FROM EMP 사원 LEFT OUTER JOIN EMP 관리자 ON 사원.MGR = 관리자.EMPNO;

SELECT 사원.EMPNO, 사원.ENAME, 관리자.EMPNO, 관리자.ENAME
FROM EMP 사원, EMP 관리자
WHERE 사원.MGR = 관리자.EMPNO(+);

SELECT * FROM DEPT;

SELECT 
FROM EMP E,DEPT D
WHERE E.DEPTNO=D.DEPTNO;

SELECT E.ENAME,E.DEPTNO,D.DNAME FROM EMP E INNER JOIN DEPT D ON E.DEPTNO = D.DEPTNO;

SELECT * FROM EMP;
SELECT * FROM DEPT;

SELECT E.ENAME,E.JOB,E.DEPTNO,D.DNAME
	FROM EMP E, DEPT D
	WHERE E.DEPTNO=D.DEPTNO AND D.LOC='DALLAS';
	
SELECT E.ENAME, D.DNAME
	FROM EMP E, DEPT D
	WHERE E.DEPTNO=D.DEPTNO AND E.ENAME LIKE '%A%'; 
	
SELECT E.ENAME ,D.DNAME,E.SAL
	FROM DEPT D , EMP E
	WHERE E.DEPTNO=D.DEPTNO AND E.SAL > 3000;

SELECT E.JOB,E.ENAME,D.DNAME
	FROM EMP E , DEPT D
	WHERE E.DEPTNO=D.DEPTNO AND E.JOB='SALESMAN';
	
	SELECT * FROM EMP;
	SELECT * FROM SALGRADE;
	
SELECT E.EMPNO AS "사원번호", E.ENAME AS "사원이름" , E.SAL*12 AS "연봉" , E.SAL*12+NVL(E.COMM,0) AS "실급여", S.GRADE AS "급여등급"
	FROM EMP E , SALGRADE S
	WHERE NVL(E.COMM,-1) <> -1 AND E.SAL BETWEEN S.LOSAL AND S.HISAL;
	
SELECT E.DEPTNO, D.DNAME,E.ENAME,E.SAL,S.GRADE
	FROM EMP E , DEPT D, SALGRADE S
	WHERE E.DEPTNO=D.DEPTNO AND E.SAL BETWEEN S.LOSAL AND S.HISAL;
	
SELECT E.DEPTNO,D.DNAME,E.ENAME,E.SAL,S.GRADE
	FROM EMP E , DEPT D, SALGRADE S
	WEHRE E.DEPTNO=D.DEPTNO AND E.SAL BETWEEN S.LOSAL AND S.HISAL AND E.DEPTNO = 10 OR 20
	ORDER BY D.DEPTNO ASC , E.SAL DESC;
	
SELECT E.DEPTNO,D.DNAME,E.ENAME,E.SAL,S.GRADE
	FROM EMP E , DEPT D, SALGRADE S
	HAVING E.DEPTNO=D.DEPTNO AND E.SAL BETWEEN S.LOSAL AND S.HISAL 
	AND E.DEPTNO = 10 OR E.DEPTNO = 20
	ORDER BY D.DEPTNO ASC;
	
	SELECT E1.EMPNO AS "사원번호" ,E1.ENAME AS "사원이름" ,E2.EMPNO AS "관리자 번호",E2.ENAME AS "관리자이름"
	FROM EMP E1 , EMP E2
	WHERE E1.MGR = E2.EMPNO;
	
	SELECT ENAME,E.DEPTNO,DNAME
	FROM EMP E,DEPT D
	WHERE E.DEPTNO=D.DEPTNO;	
	
	SELECT ENAME,DNAME
	FROM EMP JOIN DEPT USING(DEPTNO)
	WHERE ENAME LIKE '%A%';
	
	SELECT ENAME,DNAME,SAL
	FROM EMP JOIN DEPT USING(DEPTNO)
	WHERE SAL > 3000;
	
	SELECT JOB,ENAME,DNAME
	FROM EMP JOIN DEPT USING (DEPTNO)
	WHERE JOB='SALESMAN';
	
	SELECT E.EMPNO AS "사원번호", E.ENAME AS "사원이름" , E.SAL*12 AS "연봉" , SAL*12+COMM AS "실급여", S.GRADE AS "급여등급"
	FROM EMP E , SALGRADE S
	WHERE NVL(E.COMM,-1) <> -1 AND E.SAL BETWEEN S.LOSAL AND S.HISAL;
	
	SELECT EMPNO AS "사원번호", ENAME AS "사원이름" , SAL*12 AS "연봉" , SAL*12+NVL(COMM,0) AS "실급여", GRADE AS "급여등급"
	FROM EMP JOIN SALGRADE ON (SAL BETWEEN LOSAL AND HISAL)
	WHERE COMM IS NOT NULL;
	
	SELECT DEPTNO, DNAME,ENAME,SAL,GRADE
	FROM EMP JOIN DEPT USING(DEPTNO)
	JOIN SALGRADE ON SAL BETWEEN LOSAL AND HISAL
	WHERE DEPTNO = 10;
	
SELECT E.DEPTNO,D.DNAME,E.ENAME,E.SAL,S.GRADE
	FROM EMP E , DEPT D, SALGRADE S
	WHERE E.DEPTNO=D.DEPTNO AND E.SAL BETWEEN S.LOSAL AND S.HISAL 
	AND (E.DEPTNO = 10 OR E.DEPTNO = 20)
	ORDER BY E.DEPTNO ASC, E.SAL DESC;
	
CREATE TABLE QCLASS

