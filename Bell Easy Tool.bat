@echo off
@title Bell Easy Tool
@color B

echo Bell Easy Tool ������ : ���(bell04204@gmail.com)
echo ������ ����Ʈ : http://BellLife.tistory.com/
echo.
echo        [����(Usage)]
echo ���� ���� ȯ�� ���� : 'install' �Է�
echo ���� : 'build' �Է�

:COMMAND
@color B
SET /P input=��ɾ� �Է� : 
IF %input%==install GOTO INSTALL
IF %input%==build GOTO BUILD
echo �߸��� ��ɾ� �Դϴ�.
echo.
GOTO COMMAND

:INSTALL
@color F
echo ���� ����ȯ�� �ڵ� ��ġ ����
start gradlew setupDevWorkspace eclipse
echo.
GOTO COMMAND

:BUILD
@color F
echo ���� ����
start gradlew build
echo.
exit
GOTO COMMAND