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

select * from departments;


create table departments (
	id integer primary key, -- unique, not null
	dep_name varchar(30)
);
select * from departments;

create table employees (
	id integer primary key,
    emp_name varchar(30),
    join_date date,
    dep_id integer not null, -- 
    foreign key (dep_id) references departments(id) -- ensure employees.dep_id exists in departments
);
select * from employees;

insert into departments values (1, 'IT');
insert into departments values (2, 'MK');
insert into employees values (1, 'John', '2025-10-01', 1);
-- insert into employees values (2, 'Leo', '2025-01-01', 100);
insert into employees values (2, 'Leo', '2025-01-01', 2);

drop table employees;
drop table departments;

-- MANY TO MANY EXAMPLE
-- Student vs Course
create table Students (
	id integer primary key,
	stu_name varchar (30) not null
);

create table courses(
	id integer primary key,
    course_name varchar(30) not null
);

create table student_courses (
	id integer primary key,
	reg_date date not null,
    stu_id integer not null,
    course_id integer not null,
    foreign key (stu_id) references students(id),
    foreign key (course_id) references courses(id)
);
-- PK, FK
insert into students values (1, 'Leo');
insert into students values (2, 'Jenny');

insert into courses values (1, 'MATH');
insert into courses values (2, 'ENGLISH');
insert into courses values (3, 'CHINESE');

insert into student_courses values (1, '2025-08-05', 1, 2); -- Leo English
insert into student_courses values (2, '2025-08-05', 1, 3); -- Leo Chinese

insert into student_courses values (3, '2025-08-30', 2, 2); -- Jenny English
insert into student_courses values (4, '2025-08-15', 2, 1); -- Jenny Math

select * from student_courses;

-- INNER JOIN (SQL)
select * from deparment; 
select * from employees;

-- Inner join (table data x table data)
select e.id as emp_id,
d.id as dep_id,
e.emp_name,
d.dep_name,
e.join_date
from departments d inner join employees e on e.dep_id = d.id;

-- Students course
-- inner join

select s.id, s.stu_name, c.course_name, r.reg_date
from student_courses r 
	inner join students s on r.stu_id = s.id
    inner join courses c on r.course_id = c.id;
    
select * from student_courses;

select * from students;

-- Database
-- One-to-One
-- Table A 3 columns (heavy read) (Username, Password)
-- Table B 4 columns (read-write) (Profile picture)

-- Table C 7 columns (Username, Password, Profile picture)

select concat(first_name, ' ', last_name) 
	from persons;
    
select substring(first_name, 2, 4)
	from persons;
    
select length(first_name), length(last_name), Upper(first_name), lower(last_name) from persons;
select replace(first_name, 'J', 'X')
	from persons;
    
insert into persons values (8, '大明', '陳', 26, 'MK', 28000);
select char_length(first_name), p.* from persons p;

select instr(first_name, 'J'), p.* from persons p;

select p.*, (select max(salary) from persons)
from persons p;

-- Find the first name and last name of the person, who has the max salary\
-- Subquery approach 1
select *
from persons
where salary = (select max(salary) from persons);
-- Subquery approach 2
select *
from persons p1 inner join (select max(salary) as max_salary from persons) p2 on p1.salary = p2.max_salary;

-- CTE (approach 3)
with max_salary_table as (
	select max(salary) as max_salary from persons
), min_salary_table as (
	select min(salary) as max_salary from persons
)
select p.*, m.*
from persons p inner join max_salary_table m on p.salary = m.max_salary;

-- Exist
select * from departments;
select * from employees;
insert into departments values (3, 'HR');

-- Find the departments, and its employees (inner join)
select d.*, e.*
from departments d inner join employees e on e.dep_id = d.id;

-- find the departments (show department detail ONLY) which has employee
select d.*
from departments d
where exists (select 1 from employees e where d.id = e.dep_id);

-- Find the departments, which is no employee (left join)
select d.*, e.*
from departments d left join employees e on e.dep_id = d.id
where e.dep_id is null;

select d.*
from departments d
where not exists (select 1 from employees e where d.id = e.dep_id);

-- Find the departments, no matter it has employee or not
select d.*, e.*
from departments d left join employees e on e.dep_id = d.id; 

-- ORDER BY
select * 
from persons
order by salary desc
limit 2;
-- descending order

select *
from persons
order by salary;
-- ascending order

select *
from persons
order by salary asc;
-- ascending order