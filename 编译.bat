@echo off
set b=%cd%
echo "====���ڱ���,���Ե�...===="
rd /s /Q %b%\aj-main\target\aj-main
md %b%\aj-main\target\aj-main
mvn package -Dmaven.skip.test=true
echo "====�������===="
::cd %b%\aj-main\target\aj-main
start /max %b%\aj-main\target\aj-main

pause