create database if not exists DigitalNurture;
use  DigitalNurture;
create table users(
   user_id int primary key auto_increment,
   email varchar(100) not null,
   city varchar(100) not null,
   registration_date date not null
   );
   alter table users add column full_name varchar(100) not null;
create table events (
    event_id int primary key auto_increment,
    title varchar(200) not null,
    description text,
    city varchar(100) not null,
    start_date datetime not null,
    end_date datetime not null,
    status enum('upcoming','completed','cancelled'),
    organizer_id int,
    foreign key (organizer_id) references users(user_id)
    );
    create table sessions(
    session_id int primary key auto_increment,
    event_id int,
    title varchar(200) not null,
    speaker_name varchar(100) not null,
    start_time datetime not null,
    end_time datetime not null,
    foreign key (event_id) references events (event_id)
    );
    
    create table registrations(
       registration_id int primary key auto_increment,
       user_id int,
       event_id int,
       registration_date date not null,
       foreign key (user_id) references users(user_id), 
       foreign key (event_id) references events(event_id)
       );
	
    create table feedback(
      feedback_id int primary key auto_increment,
      user_id int,
      event_id int,
      rating int check (rating between 1 and 5),
      comments text,
      feedback_date datetime not null,
      foreign key (user_id) references users(user_id),
      foreign key (event_id) references events(event_id)
      );
      
      create table resources(
        resource_id int primary key auto_increment,
        event_id int,
        resource_type enum('pdf','image','link'),
        resource_url varchar(255) not null,
        uploaded_at datetime not null,
        foreign key (event_id) references events(event_id)
        );
     
        insert into users
        (user_id,full_name,email,city,registration_date)
        values
        (1,"alice johnson","alice@gmail.com","new york",'2024-12-01'),
        (2,"Bob smith","bob@gmail.com","Los Angeles",'2024-12-05'),
        (3,"Charlie Lee","charlie@gmail.com","Chicago",'2024-12-10'),
        (4,"Diana King","diana@gmail.com","New York",'2025-01-15'),
        (5,"Ethan Hunt","ethan@example.com","Los Angles",'2025-02-01');
        select * from users;
        
        insert into events 
        values
        (1,"Tech Innovators Meetup","A meetup for tech enthusiasts.","New York",'2025-06-10 10:00:00','2025-06-10 16:00:00','upcoming',1),
        (2,"AI & ML Conference","Conference on AI and ML adancements","Chicago",'2025-05-15 09:00:00','2025-05-15 17:00:00','completed',3),
        (3,"Frontend Development Bootcamp","Hands-on training on frontend tech.","Los Angeles","2025-07-01 10:00:00","2025-07-03 16:00:00","upcoming",2);
        
        select * from events;
        
        insert into sessions
        values 
        (1,1,"opening keynote","Dr.Tech",'2025-06-10 10:00:00','2025-06-10 11:00:00'),
        ( 2,1,"future of web dev","Alice Johnson",'2025-06-10 11:15:00','2025-06-10 12:30:00'),
        (3,2,"AI in healthcare","Charlie Lee",'2025-05-15 09:30:00','2025-05-15 11:00:00'),
        (4,3,"Intro to HTML5","Bob Smith","2025-07-01 10:00:00","2025-07-01 12:00:00");
        
        select * from sessions;
        
        insert into registrations
        values
        (1,1,1,'2025-05-01'),
        (2,2,1,'2025-05-02'),
        (3,3,2,'2025-04-30'),
        (4,4,2,'2025-04-28'),
        (5,5,3,'2025-06-15');
        
        select * from registrations;
        
        insert into feedback
        values
        (1,3,2,4,"Great insights!","2025-05-16"),
        (2,4,2,5,"Very informative.","2025-05-16"),
        (3,2,1,3,"Could be better.",'2025-06-11');
        
        select * from feedback;
        
        insert into resources
        values (1,1,"pdf","tech_meetup_agency.pdf","2025-05-01 10:00:00"),
        (2,2,"image","ai_poster.jpg","2025-04-20 09:00:00"),
        (3,3,"link","html5_docs","2025-06-25 15:00:00");
        
        select * from resources;
        
        
       --  list of all upcoming events a user is registered for in their city,sorted by date
        select * from events where status = "upcoming"
        order by start_date;