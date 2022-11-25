create database assignments;
use assignments;
create table CUSTOMER (Cust_id varchar(5), Fname Varchar(15), Lname Varchar(15), Area char(2), Phone numeric(10), DOB date, Payment numeric(6,2));
insert into CUSTOMER values 
('A01', 'Ivan', 'Ross', 'SA', 6125467, '1986-01-15', 800.50),
('A02', 'Vandana', 'Ray', 'MU', 5560379, '1987-12-20', 1000.75),
('A03', 'Pramada', 'Jauguste', 'DA', 4560389, '1967-07-25', 500.00),
('A04', 'Basu', 'Navindi', 'BA', 6125401, '1956-02-28', 860.00),
('A05', 'Ravi', 'Shridhar', 'NA', null, '1989-02-15', 500.50),
('A06', 'Rukmini', 'Aiyar', 'GH', 5125274, '1987-07-23', 1500.50);
describe CUSTOMER; #Display the structure
select * from CUSTOMER; #Display the data
alter table CUSTOMER add System_date date after Payment; #Add a new column
select * from CUSTOMER;
update CUSTOMER set Phone=5555555 where Cust_id='A02' and Cust_id='A04'; #Update phone number with criteria
update CUSTOMER set DOB=null where Cust_id='A03' and Cust_id='A05'; #Update DOB with some criteria
select * from CUSTOMER; #Display the updated table
delete from CUSTOMER where Cust_id='A01' and Cust_id='A05'; #Delete 2 rows from table
truncate table CUSTOMER; #Delete rows from table
insert into CUSTOMER values #Insert new values in table
('AD01', 'Anand', 'Sadhu', 'KA', 7059331, '1900-01-15', 9000.25, '1900-01-15'),
('AD02', 'Teji', 'Yogi', 'CH', 7059332, '1900-01-30', 9000.25, '1900-01-30'),
('AD03', 'Naga', 'Sadhu', 'KA', 7059333, '1900-01-01', 9000.25, '1900-01-01'),
('AD04', 'Shiva', 'Samanth', 'KA', 7059334, '1900-01-25', 9000.25, '1900-01-25'),
('AD05', 'Deva', 'Sannas', 'MA', 7059335, '1900-01-05', 9000.25, '1900-01-05');
update CUSTOMER set Payment=200.34 where Fname='Naga'; #update values with criteria
delete from CUSTOMER where Phone=7059331; #Delete one reord with particular criteria