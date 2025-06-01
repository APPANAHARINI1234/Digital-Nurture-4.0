create database Users;
use Users;
create table users (
    user_id int primary key auto_increment,
    full_name varchar(100) not null,
    email varchar(100) unique not null,
    city varchar(100) not null,
    registration_date date not null
    );
select * from users;

create database Events;
use Events;
create table events (
     event_id int primary key auto_increment,
     title varchar(200) not null,
     description text,
     city varchar(100) not null,
     start_date datetime not null,
     end_date datetime not null,
     status enum {'completed','upcoming','cancelled'},
     organizer_id int f

    
    