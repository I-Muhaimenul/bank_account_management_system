create or replace PROCEDURE add_admin (p_username IN varchar2, p_checker OUT varchar2, p_password IN varchar2, p_name IN varchar2)
IS
flag login.username%type;
BEGIN
select username into flag
from login
where username=p_username;
IF(sql%found) THEN 
p_checker := 'Username Already Taken';
END IF;
EXCEPTION
WHEN NO_DATA_FOUND THEN
insert into login values(p_username, p_password, p_name);
p_checker := 'Admin Added';
END;