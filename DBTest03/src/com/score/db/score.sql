DROP TABLE SCORE;

CREATE TABLE SCORE(
  S_NAME VARCHAR2(20) PRIMARY KEY,
  S_KOR NUMBER NOT NULL,
  S_ENG NUMBER NOT NULL,
  S_MATH NUMBER NOT NULL,
  S_SUM NUMBER,
  S_AVG NUMBER,
  S_GRADE VARCHAR2(2) CHECK (S_GRADE IN ('A', 'B', 'C', 'D', 'F'))
);

INSERT INTO SCORE
VALUES('LEE', 100,100,100,300,100.0,'A');

SELECT S_NAME,S_KOR,S_ENG,S_MATH,S_SUM,S_AVG,S_GRADE
FROM SCORE
ORDER BY S_AVG DESC;

SELECT R,S_NAME,S_KOR,S_ENG,S_MATH,S_SUM,S_AVG,S_GRADE
FROM     
 	(SELECT ROWNUM AS R, S_NAME,S_KOR,S_ENG,S_MATH,S_SUM,S_AVG,S_GRADE
	FROM 
		(
		SELECT  S_NAME,S_KOR,S_ENG,S_MATH,S_SUM,S_AVG,S_GRADE
		FROM SCORE
		ORDER BY S_AVG DESC
		) A
	) B
WHERE R = 2;
