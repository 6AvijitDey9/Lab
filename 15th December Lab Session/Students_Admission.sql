use assignments;
create table admission(Registration_Id numeric(4) primary key, name varchar (20), address varchar (20), phone_no numeric (10), dept varchar (10), 10th_marks numeric(5,2), 12th_marks numeric(5,2), year_of_passing int(4));
create table students(Registration_Id numeric(4), password varchar(6));
alter table students add foreign key(Registration_Id) references admission(Registration_Id);