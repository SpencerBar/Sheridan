--set serveroutput on;

--declare
--    v_name varchar2(10);
--BEGIN
--   v_name := '&p_name';
--   dbms_output.put_line('Your name is: ' || v_name);
--END;

declare 
    v_var1 number(10);
    v_var2 number(10); 
    v_result number(10);
BEGIN
    v_var1 := '&p_var1';
    v_var2 := '&p_var2';
    v_result := v_var1 + v_var2;
    dbms_output.put_line(v_result);
END;
    
    