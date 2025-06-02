use DigitalNurture;
  insert into feedback
        values
        (4,3,2,4,"Great insights!","2025-05-16"),
        (5,4,1,5,"Very informative.","2025-05-16"),
        (6,2,2,3,"Could be better.",'2025-06-11'),
        (7,3,1,2,"Great insights!","2025-05-16"),
        (8,4,1,3,"Very informative.","2025-05-16"),
        (9,2,1,3,"Could be better.",'2025-06-11');
        
        select * from feedback;
        
select event_id, avg(rating) from feedback  group by event_id having  (select count(feedback_id) > 4) order by avg(rating) desc limit 1; 
        