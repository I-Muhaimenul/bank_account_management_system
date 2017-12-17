---ALL_ACCOUNTS FUNCTION
--- TO RETRIEVE ALL THE EXISTING ACCOUNTS

create or replace FUNCTION all_accounts 
RETURN SYS_REFCURSOR 
AS 
my_cursor SYS_REFCURSOR; 
BEGIN 
OPEN my_cursor FOR SELECT account.acc_no, account_info.name, account_info.username FROM account, account_info 
WHERE account.acc_no = account_info.acc_no 
ORDER BY account.acc_no; 
RETURN my_cursor; 
END; 
