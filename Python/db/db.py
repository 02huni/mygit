import oracledb as cx_Oracle

class BookList:
    def __init__(self):
        client_lib_dir=r"C:\Users\user\Desktop\tools\instantclient-basic-windows.x64-19.25.0.0.0dbru\instantclient_19_25"
        cx_Oracle.init_oracle_client(lib_dir=client_lib_dir)

        self.dsn=cx_Oracle.makedsn("localhost", 1521,sid="xe")
        self.user="scott"
        self.password="tiger"

        try:
            print("데이터베이스 연결준비..." )
            self.connection=cx_Oracle.connect(user=self.user, password=self.password, dsn=self.dsn)
            print("데이터 베이스 연결 성공")
        except cx_Oracle.DatabaseError as e:
            print("데이터베이스 연결 실패",e)
            self.connection =None
        
    def sql_run(self):
        if self.connection is None:
            print("데이터베이스 연결이 없습니다.")
            return
        
        query ="SELECT * FROM Book"
        try:
            with self.connection.cursor() as cursor:
                cursor.execute(query)
                print("BOOK NO \tBOOK NAME \t\t PUBLISHER \tPRICE")
                for row in cursor:
                    print(f"\t{row[0]}\t{row[1]}\t{row[2]}\t{row[3]}")

                print("데이터베이스 작업완료")
        except cx_Oracle.DatabaseError as e:
            print("SQL 실행 중 오류 발생",e)
        finally:
            if  self.connection:
                self.connection.close()
                print("데이터베이스 연결종료")

if __name__ == "__main__":
    book_list=BookList()
    book_list.sql_run()