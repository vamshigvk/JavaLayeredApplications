create table Employee(
id number(5),
name varchar2(30),
salary number(7,2),
department varchar2(40),
dateOfBirth Date, 
dateOfJoining Date
);

create sequence empid_seq start with 1000;