use assignments;
create table Customer_ (Cust_id varchar(5) primary key, Fname varchar(15) not null, Lname varchar(15), 
Area char(2) not null, Phone numeric(10));
insert into Customer_ values 
('A01', 'Ivan', 'Ross', 'SA', 6125467),
('A02', 'Vandana', 'Ray', 'MU', 5560379),
('A03', 'Pramada', 'Jauguste', 'DA',4560389),
('A04', 'Basu', 'Navindi', 'BA', 6125401),
('A05', 'Ravi', 'Shridhar', 'NA', null),
('A06', 'Rukmini', 'Aiyar', 'GH', 5125274);
create table Movie (Mv_no numeric(2) primary key, Cust_id varchar(5), 
Title varchar(20) not null, Star char(2) not null, Price numeric(3));
insert into Movie values 
(1, 'A02', 'Bloody', 'JC', 181),
(2, 'A04', 'The Firm', 'TC', 200),
(3, 'A01', 'Pretty Women', 'RG', 151),
(4, 'A06', 'Home Alone', 'MC', 150),
(5, 'A05', 'The Fugitive', 'MF', 200),
(6, 'A03', 'Coma', 'MD', 100),
(7, 'A02', 'Dracula', 'GO', 150),
(8, 'A06', 'Quick Change', 'BM', 100),
(9, 'A03', 'Gone with the Wind', 'CB', 200),
(10, 'A05', 'Carry on Doctor', 'LP', 100);
alter table Movie add foreign key(Cust_id) references Customer_(Cust_id); #Making a column foreign key of Movie table
select Title from Movie where Price>100 and Price<200; #Showing movie titles where price is greater than 100 and less than 200
select Cust_id from Movie where Star='JC' or Star='TC' or Star='MC'; #Showing cust_id where star JC/TC/MC
select Cust_id from Customer_ where Area like '%A%'; #Display customer id who have A in their area name
select Title from Movie where Price<180 and length(Title)=6; #Display movie tile where price within 180 and movie name is within 6 charecters
select Title, Price, Price+(price*(10/100)) as 'Hike Price' from Movie; #display the title, price and 10% hike price
select Fname, Lname, 'Stays in', Area, 'and his phone number is', Phone from Customer_; #Display a custom line
insert into Customer_ values ('A07', 'Java', null, 'IN', 61261261); #Add a null value in Customer_ table
select Fname, Lname from Customer_ where Phone is null; #Display the customer name where phone number not recorded
update Customer_ set Phone=6134506 where Cust_id='A05'; #Update the non recorded phone number
select distinct Cust_id from Customer_; #Display unique customer ids
delete from Movie where Star is not null; #Delete the not null constraint from star column in movie table
delete from Customer_ where Fname='Pramada'; #Delete any row from customer table
delete from Movie where Title = 'Coma'; #Delete any row from Movie table
drop table Customer_; #Drop table Customer_. But, it is not possible because, the table referenced by a foreign key constraint on Movie table
drop table Movie; #Drop table Movie sucessfull
alter table Movie drop foreign key Cust_id; #Drop foreign key from movie table is not possible because the table is deleted at previous line