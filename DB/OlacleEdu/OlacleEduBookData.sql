--------------------------------------------------------
--  ������ ������ - �����-7��-24-2025   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table BOOK
--------------------------------------------------------

  CREATE TABLE "SCOTT"."BOOK" 
   (	"BOOKID" NUMBER(2,0), 
	"BOOKNAME" VARCHAR2(40 BYTE), 
	"PUBLISHER" VARCHAR2(40 BYTE), 
	"PRICE" NUMBER(8,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SCOTT.BOOK
SET DEFINE OFF;
Insert into SCOTT.BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE) values (1,'�౸�� ����','�½�����',7000);
Insert into SCOTT.BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE) values (2,'�౸�ƴ� ����','������',13000);
Insert into SCOTT.BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE) values (3,'�౸�� ����','���ѹ̵��',22000);
Insert into SCOTT.BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE) values (4,'���� ���̺�','���ѹ̵��',35000);
Insert into SCOTT.BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE) values (5,'�ǰ� ����','�½�����',8000);
Insert into SCOTT.BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE) values (6,'���� �ܰ躰���','�½�����',6000);
Insert into SCOTT.BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE) values (7,'�߱��� �߾�','�̻�̵��',20000);
Insert into SCOTT.BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE) values (8,'�߱��� ��Ź��','�̻�̵��',13000);
Insert into SCOTT.BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE) values (9,'�ø��� �̾߱�','�Ｚ��',7500);
Insert into SCOTT.BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE) values (10,'Olympic Champions','Pearson',13000);
Insert into SCOTT.BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE) values (13,'����������','������м���',25000);
Insert into SCOTT.BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE) values (15,'������ �����','������м���',25000);
--------------------------------------------------------
--  DDL for Index SYS_C007002
--------------------------------------------------------

  CREATE UNIQUE INDEX "SCOTT"."SYS_C007002" ON "SCOTT"."BOOK" ("BOOKID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table BOOK
--------------------------------------------------------

  ALTER TABLE "SCOTT"."BOOK" ADD PRIMARY KEY ("BOOKID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
