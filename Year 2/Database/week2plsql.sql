--set serveroutput on;
--DECLARE
--    price NUMBER(10,2):= 100.99;
--    discount NUMBER;
--    discPrice NUMBER (10,2);
--BEGIN
--    discount := '&tDiscount';
--    dbms_output.put_line('Enter a Discount(eg .20 for 20%): ' || discount);
--    discPrice := price * (1 - discount);
--    dbms_output.put_line(discPrice);
--END;
--/

--DECLARE
--simple_interest NUMBER;
--principal NUMBER;
--rate NUMBER;
--time NUMBER;
--BEGIN
--principal := &tPrincipal;
--dbms_output.put_line('Enter a Principal(XXX.XX): ' || principal);
--rate := &tRate;
--dbms_output.put_line('Enter a Rate(%): ' || rate);
--time := &tTime;
--dbms_output.put_line('Enter a Time(Days): ' || time);
--simple_interest := (principal * rate * time) / 100;
--dbms_output.put_line(simple_interest);
--END;
--/

--DECLARE
--l_num SIMPLE_INTEGER := 0;
--BEGIN
--FOR i IN 1 .. 20 LOOP
--l_num := l_num + 1073741824;
--END LOOP;
--DBMS_OUTPUT.PUT_LINE(TO_CHAR(l_num));
--END;
--/

DECLARE
BEGIN
    FOR num IN 1..100 LOOP
            IF MOD(num, 2) = 1 THEN
                dbms_output.put_line(num);
            END IF;
    END LOOP;
END;