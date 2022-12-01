use assignments;
create table Department (Department_ID numeric(4), Department_Name varchar(10), Department_Head varchar(10), Department_Description varchar(20), Primary key(Department_ID));
create table Employee (Employee_Id numeric(4) primary key, Employee_Name Varchar(10), Employee_Address Varchar(30), Employee_Salary numeric(7), Employee_Contact_No numeric(10), Department_Id numeric(4));
alter table Employee add foreign key(Department_Id) references Department(Department_ID);