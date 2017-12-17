create or replace PROCEDURE ADMINLOGIN (p_username IN VARCHAR2, p_password IN VARCHAR2, p_name IN VARCHAR2, p_valid OUT NUMBER)
IS
t_username VARCHAR2(20);
BEGIN
SELECT USERNAME INTO t_username FROM LOGIN
WHERE USERNAME = p_username AND PASSWORD = p_password AND NAME = p_name;
IF (sql%FOUND) THEN p_valid := 1;
END IF;
EXCEPTION
WHEN NO_DATA_FOUND THEN
p_valid := 0;
END;
