-- Sessions per Upcoming Event
-- Display all upcoming events with the count of sessions scheduled for them.

select event_id,count(session_id) from sessions as x
where (select status, event_id from events where status = 'upcoming' and events.event_id = sessions.event_id)
group by event_id  ; 


select * from sessions as s
inner join 
events as e
 on s.event_id = e.event_id;


select s.event_id,count(s.session_id) from sessions as s
inner join
events as e
on s.event_id=e.event_id
where e.status = 'upcoming'
group by s.event_id;