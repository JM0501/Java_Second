@ECHO OFF
REM Set path for JDK
SET JAVA_HOME="C:\jdk-21"
SET PATH=%JAVA_HOME%\bin;%PATH%;

REM Display Java version.
javac --version

REM set path variables...
cd ..
set PRAC_BIN=.\bin
set PRAC_SRC=.\src
set PRAC_DOC=.\docs

REM clean all class files in the folder.
del %PRAC_BIN%\*.class

REM Code compilation
ECHO Trying Code Compilation
javac -sourcepath %PRAC_SRC% -cp %PRAC_BIN% -d %PRAC_BIN% %PRAC_SRC%\*.java

REM set the maximum of the array to be reversed.
SET LIMIT=8

REM Running Code
ECHO Trying to run
REM package accse.csc2a
java -classpath %PRAC_BIN% Main %LIMIT%


REM Go back to docs folder
cd %PRAC_DOC%

PAUSE
