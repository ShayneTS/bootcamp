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

-- update
select * from orders;

-- Java: boolean, Database: varchar(1) 'Y'/'N'

-- update (next lesson)
-- System.out.println("hello"); -- 3ms
update orders set amount = amount * 0.9 where order_no = 'TT250002';
-- Keith Chan -> IT
-- MYSQL is case insensitive
select * from persons;
update persons set department = 'IT' where first_name = 'Keith' and last_name = 'Chan';

-- Update 2 fields in one statement
-- Jenny Lau -> HR, age -> 55
update persons set department = 'HR', age = 55 where first_name = 'Jenny' and last_name = 'Lau'; 
select * from persons;

-- add colum in a table (All null values after adding a new column)
-- Java Double (wrapper class allow NULL value while primitive cannot) 
alter table persons add salary decimal(8,2);
select * from persons;

-- Jenny salary 25000
-- Oscar 18000
-- Kelly 37000
update persons set salary = 25000 where first_name = 'Jenny' and last_name = 'Lau';
update persons set salary = 18000 where first_name = 'Oscar' and last_name = 'Chan';
update persons set salary = 37000 where first_name = 'Kelly' and last_name = 'Lau';
select * from persons;
-- delete from (delete all data) / drop table (remove table structure)

-- Group By + Having

-- Aggregation Function
-- min / max / count / average / sum (SD, Median, etc)

-- Many Data -> Single value
-- Data (Row)
select salary from persons where first_name = 'Oscar' and last_name = 'Chan';
select salary from persons where last_name = 'Lau';
select sum(salary) from persons where last_name = 'Lau';
select * from persons;
select sum(salary) from persons;
-- select (show which columns)
-- where (filter rows)
-- group by (grouping)

-- Group by -> select Department + Agg Function
-- count (salary)
select department, sum(salary), max(salary), min(salary), count(*), avg(salary) from persons group by department;

select department, sum(salary) / count(*) from persons group by department;
select department, max(salary) + min(salary) from persons group by department;
select department, max(salary) + min(age) from persons group by department;

-- round (x,2)
select department, round(sum(salary) / count(*), 2) from persons group by department;

-- where + group
select department, sum(salary) from persons group by department;
select department, sum(salary) from persons where age >= 30 group by department;

-- 'Group by' likely -> Aggregation Funciton
-- Aggregation Funciton
-- example in notes: 
-- select genre, sum(price) / count(*) from books group by genre; (correct!)

select * from persons;
select id, first_name, salary, department, 'hello', 1 from persons;
select department, count('hello'), count(1), count(*) from persons group by department;

-- select (read)
-- update , insert, delete (write)
select concat(first_name, 'hello') from persons;

-- WHERE (for filtering row) -> GROUP + HAVING (for filtering group)
select department, sum(salary) as total_salary
from persons
where age >= 30 -- this runs first
group by department
having count(1) > 2; -- HR count only = 2, whole group filtered

-- department max salary >= 30000, 
-- select number of persons in that department
select * from persons;
select department, count(*) as number_of_persons
from persons
group by department having max(salary) >= 30000; -- the group has anyone with salary > 30000 

-- STEP 1: WHERE (filter rows)
-- STEP 2: GROUP BY + HAVING (filter group) (true or false)
-- STEP 3: SELECT something from the groups

select department, sum(salary)
from persons
group by department having max(salary) >= 20000;

-- highest salary group stay? (similar to Leetcode 619)
select max(total_salary)
from
(select department, sum(salary) as total_salary
from persons
group by department having max(salary) >= 20000) as result;