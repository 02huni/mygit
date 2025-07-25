--------------------------------------------------------
--  颇老捞 积己凳 - 格夸老-7岿-24-2025   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table IMPORTED_BOOK
--------------------------------------------------------

  CREATE TABLE "HR"."IMPORTED_BOOK" 
   (	"BOOKID" NUMBER, 
	"BOOKNAME" VARCHAR2(40 BYTE), 
	"PUBLISHER" VARCHAR2(40 BYTE), 
	"PRICE" NUMBER(8,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
