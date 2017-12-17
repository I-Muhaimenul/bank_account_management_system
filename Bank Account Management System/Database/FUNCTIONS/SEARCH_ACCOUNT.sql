---SEARCH FOR AN PARTICULAR ACCOUNT

create or replace FUNCTION search_account(p_account IN number) 
RETURN SYS_REFCURSOR 
AS 
my_cursor SYS_REFCURSOR; 
BEGIN 
OPEN my_cursor FOR SELECT account.acc_no, account.type, account_info.name, account_info.mobile, account_info.present_address, account_info.permanent_address, account_info.username, account_info.password 
FROM account, account_info where account.acc_no=p_account and account.acc_no=account_info.acc_no; 
RETURN my_cursor; 
END; 