

CREATE OR REPLACE PROCEDURE displayOverPrice (priceOver IN NUMBER)
IS
l_string VARCHAR2(40);
v_product_id sh.products.product_id%TYPE;
v_product_name sh.products.product_name%TYPE;
v_price sh.products.product_list_price%TYPE;
BEGIN
l_string := 'SELECT product_id, product_name, product_list_price FROM sh.products WHERE product_list_price > :a';
EXECUTE IMMEDIATE l_String 
INTO v_product_id, v_product_name, v_price
USING priceOver;

--EXCEPTION:

END;
/
exec displayOverPrice(500);
END;
