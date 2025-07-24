--------------------------------------------------------
--  파일이 생성됨 - 목요일-7월-24-2025   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table T_MEMBER
--------------------------------------------------------

  CREATE TABLE "SCOTT"."T_MEMBER" 
   (	"ID" VARCHAR2(10 BYTE), 
	"PWD" VARCHAR2(10 BYTE), 
	"NAME" VARCHAR2(50 BYTE), 
	"EMAIL" VARCHAR2(50 BYTE), 
	"JOINDATE" DATE DEFAULT sysdate
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SCOTT.T_MEMBER
SET DEFINE OFF;
Insert into SCOTT.T_MEMBER (ID,PWD,NAME,EMAIL,JOINDATE) values ('hong','1212','홍길동','hong@gmail.com',to_date('25/06/24','RR/MM/DD'));
Insert into SCOTT.T_MEMBER (ID,PWD,NAME,EMAIL,JOINDATE) values ('lee','1212','이순신','lee@gmail.com',to_date('25/06/24','RR/MM/DD'));
Insert into SCOTT.T_MEMBER (ID,PWD,NAME,EMAIL,JOINDATE) values ('kim','1212','김유신','kim@gmail.com',to_date('25/06/24','RR/MM/DD'));
Insert into SCOTT.T_MEMBER (ID,PWD,NAME,EMAIL,JOINDATE) values ('asdf','sdaf','sdaf','sadf',to_date('25/06/25','RR/MM/DD'));
Insert into SCOTT.T_MEMBER (ID,PWD,NAME,EMAIL,JOINDATE) values ('sdfb','zc','sdf','sdf',to_date('25/06/25','RR/MM/DD'));
--------------------------------------------------------
--  DDL for Index SYS_C007033
--------------------------------------------------------

  CREATE UNIQUE INDEX "SCOTT"."SYS_C007033" ON "SCOTT"."T_MEMBER" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table T_MEMBER
--------------------------------------------------------

  ALTER TABLE "SCOTT"."T_MEMBER" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
