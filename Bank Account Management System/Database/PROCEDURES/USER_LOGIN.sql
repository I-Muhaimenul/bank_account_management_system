create or replace PROCEDURE USERLOGIN (p_account IN NUMBER, p_username IN VARCHAR2, p_password IN VARCHAR2, p_valid OUT NUMBER)
IS
t_account NUMBER;
BEGIN
SELECT ACC_NO INTO t_account FROM ACCOUNT_INFO
WHERE ACC_NO = p_account AND USERNAME = p_username AND PASSWORD = p_password;
IF (sql%FOUND) THEN p_valid := 1;
END IF;
EXCEPTION
WHEN NO_DATA_FOUND THEN
p_valid := 0;
END;
