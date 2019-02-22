create or replace PROCEDURE WITHDRAW (p_account IN NUMBER, p_amount IN NUMBER)
IS
BEGIN
UPDATE ACCOUNT SET BALANCE = BALANCE - p_amount
WHERE ACC_NO = p_account;
END;