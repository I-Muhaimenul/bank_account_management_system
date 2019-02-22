---SEARCH FOR A PARTICULAR ADMIN

create or replace FUNCTION search_admin(p_username IN varchar2) 
RETURN SYS_REFCURSOR 
AS 
my_cursor SYS_REFCURSOR; 
BEGIN 
OPEN my_cursor FOR SELECT * FROM login where username=p_username; 
RETURN my_cursor; 
END; 
