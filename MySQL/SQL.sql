-- MySQL Workbench (Client Side)


-- SQL
use sys; -- login sys database
create database bootcamp_2510p;
use bootcamp_2510p; -- login another database
-- One database has many tables
-- Hardisk
create table persons (
	id integer, -- doesn't matter big or small case
    first_name varchar(50), -- must define length
    last_name varchar(50),
    age integer,
    department varchar(2)
);

-- * means all columns
select * from persons;

-- 2~3 ways (the order doesn't matter as long as the input value correspond to it)
insert into persons (id, first_name, last_name, age, department) values (1, 'John', 'Lau', 30, 'IT');
insert into persons (id, first_name, last_name, age, department) values (2, 'Leo', 'Wong', 48, 'HR');
insert into persons (id, first_name, last_name, age, department) values (3, 'Jenny', 'Lau', 50, 'MK');
insert into persons (id, first_name, last_name, age, department) values (4, 'Oscar', 'Chan', 23, 'IT');

select first_name, age, department from persons;

-- where (select some rows in conditions)
select * from persons where age > 35;

--
-- delete from persons;
-- delete from persons where last_name = 'Lau'; 

-- AND OR
select * from persons where last_name = 'lau' and department = 'IT';
select * from persons where last_name = 'lau' or department = 'IT';
select * from persons where last_name = 'lau' and department = 'IT' or age > 47;
select * from persons where age > 47 or Last_name = 'Lau' and department = 'IT';
select * from persons where (age > 47 or Last_name = 'Lau') and department = 'IT';

select * from persons where department <> 'IT'; -- NOT EQUAL
select * from persons where age >=48;
select * from persons where first_name = 'JENNY'; -- data -> case insensitive apply to 60%~70% of tables

-- static method
select concat(first_name, ' ', last_name) as full_name from persons;
select concat(p.first_name, ' ', p.last_name) as full_name, p.* from persons p;

-- Without column names, you have to place the values in correct sequence
insert into persons values (5, 'Keith', 'Chan', 37, 'MK');

insert into persons values
	(6, 'Steve', 'Cheung', 20, 'IT'),
    (7, 'Kelly', 'Lau', 38, 'IT');
select * from persons;

-- Orders
-- id, order_no, amount, tran_date
-- decimal(8,2) 999999.99 max
-- date

create table orders (
	id integer,
    order_no varchar(10), 
    amount decimal(8,2),
    tran_date date
);
drop table orders; -- remove the whole table
insert into orders (id, order_no, amount, tran_date) values (1, 'TT250001', 99.99, 20251218);
insert into orders values (2, 'TT250002', 2000.00, 20251218);
insert into orders values (3, 'TT250003', 134255.13, '2025-12-02'); -- default date format
insert into orders values (4, 'TT250004', 9876.43, 20251202);
select * from orders;
delete from orders;

-- Java: boolean, Database: varchar(1) 'Y'/'N'

-- update (next lesson)