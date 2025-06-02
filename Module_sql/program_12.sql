-- Event with Maximum Sessions
-- List the event(s) with the highest number of sessions.

select e.event_id , count(s.session_id) from events as e
inner join
sessions as s
on e.event_id = s.event_id
group by e.event_id 
order by count(s.session_id) desc
limit 2;