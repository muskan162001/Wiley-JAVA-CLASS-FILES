-- Active: 1683962974216@@127.0.0.1@3306@wileyclassic
DELIMITER $$

CREATE PROCEDURE GetCustomers()
BEGIN
SELECT
    customerName,
    city,
    state,
    postalCode,
    country
FROM
    customers;
ORDER BY
    customerName;
END$$;
DELIMITER


--For All Products
DELIMITER $$

CREATE PROCEDURE GetALLProducts()
BEGIN
SELECT
    *
FROM
    products;
END$$

DELIMITER;