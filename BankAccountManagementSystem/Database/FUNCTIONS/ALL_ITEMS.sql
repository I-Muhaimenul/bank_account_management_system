---ALL_ITEMS FUNCTION
---TO RETRIEVE ADMINS INFORMATION

create or replace FUNCTION all_items 
RETURN SYS_REFCURSOR 
AS 
my_cursor SYS_REFCURSOR; 
BEGIN 
OPEN my_cursor FOR SELECT name,username,password FROM login order by name; 
RETURN my_cursor; 
END; 
