@echo.off
CALL C:\Users\user\miniconda3\Scripts\activate.bat
CALL conda activate C:\Python_Project\venvs\myproject
cd C:\Flask_projects\flask_basic
set FLASK_APP=pybo
set FLASK_DEBUG=1