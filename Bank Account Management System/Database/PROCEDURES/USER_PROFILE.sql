create or replace PROCEDURE USERPROFILE(p_account IN NUMBER, p_name OUT varchar2, p_phone OUT varchar2, p_present OUT varchar2,
p_permanent OUT varchar2, p_type OUT varchar2, p_open OUT DATE, p_balance OUT number, p_username OUT varchar2,
p_password OUT varchar2, p_gender OUT varchar2)
IS
BEGIN
SELECT ACCOUNT_INFO.NAME, ACCOUNT_INFO.MOBILE, ACCOUNT_INFO.PRESENT_ADDRESS, ACCOUNT_INFO.PERMANENT_ADDRESS,
ACCOUNT.TYPE, ACCOUNT.ACC_OPEN, ACCOUNT.BALANCE, ACCOUNT_INFO.USERNAME, ACCOUNT_INFO.PASSWORD, ACCOUNT_INFO.GENDER
INTO p_name, p_phone, p_present, p_permanent, p_type, p_open, p_balance, p_username, p_password, p_gender
FROM ACCOUNT, ACCOUNT_INFO
WHERE ACCOUNT.ACC_NO = p_account AND ACCOUNT.ACC_NO = ACCOUNT_INFO.ACC_NO;
END;