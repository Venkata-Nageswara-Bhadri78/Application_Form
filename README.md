# Application_Form
>> The Main Agenda of this project is taking the user data from HTML form and sending it to the Database.
>>
>> Technologies Used Here  :  MySQL, Java, Java Servlets, Apache TomCat Server, HTTP, XML
>>
>> The User Enter Details in the form Having the URL : **http://localhost:8080/APPLY_COLLEGE/ApplyCollege.html** then submit. The data is inserted into a table in database.
>> 
SQL Table Description:

# QUERY HERE
create table StudentResponses(
	serialNumber int AUTO_INCREMENT primary KEY,
	first_name varchar(100),
    last_name varchar(100),
    full_name varchar(200),
    father_name varchar(100),
    mother_name varchar(100),
    dateofbirth varchar(100),
    aadharnumber bigint unique,
    mobilenumber bigint,
    address varchar(10000),
    schoolname varchar(100),
    school_percentage int,
    inter_college_name varchar(100),
    inter_percentage int,
    eamcet_rank bigint,
    branch varchar(100)
	);

 # TABLE DESCRIPTION HERE

describe StudentResponses;

+--------------------+----------------+------+-----+---------+----------------+
| Field              | Type           | Null | Key | Default | Extra          |
+--------------------+----------------+------+-----+---------+----------------+
| serialNumber       | int            | NO   | PRI | NULL    | auto_increment |
| first_name         | varchar(100)   | YES  |     | NULL    |                |
| last_name          | varchar(100)   | YES  |     | NULL    |                |
| full_name          | varchar(200)   | YES  |     | NULL    |                |
| father_name        | varchar(100)   | YES  |     | NULL    |                |
| mother_name        | varchar(100)   | YES  |     | NULL    |                |
| dateofbirth        | varchar(100)   | YES  |     | NULL    |                |
| aadharnumber       | bigint         | YES  | UNI | NULL    |                |
| mobilenumber       | bigint         | YES  |     | NULL    |                |
| address            | varchar(10000) | YES  |     | NULL    |                |
| schoolname         | varchar(100)   | YES  |     | NULL    |                |
| school_percentage  | int            | YES  |     | NULL    |                |
| inter_college_name | varchar(100)   | YES  |     | NULL    |                |
| inter_percentage   | int            | YES  |     | NULL    |                |
| eamcet_rank        | bigint         | YES  |     | NULL    |                |
| branch             | varchar(100)   | YES  |     | NULL    |                |
+--------------------+----------------+------+-----+---------+----------------+
 
 select * from studentresponses;
+--------------+------------+-------------------+--------------------------+----------------+---------------+-------------+--------------+--------------+-------------------------------------------------------------------------------------------------+--------------------+-------------------+------------------------------+------------------+-------------+-------------------------------------------+
| serialNumber | first_name | last_name         | full_name                | father_name    | mother_name   | dateofbirth | aadharnumber | mobilenumber | address                                                                                         | schoolname         | school_percentage | inter_college_name           | inter_percentage | eamcet_rank | branch                                    |
+--------------+------------+-------------------+--------------------------+----------------+---------------+-------------+--------------+--------------+-------------------------------------------------------------------------------------------------+--------------------+-------------------+------------------------------+------------------+-------------+-------------------------------------------+


