-- Count how many sessions are scheduled between 10 AM to 12 PM for each event.

select session_id,count(session_id) from sessions
where ( time(start_time) >= '10:00:00' and time(end_time) <= '12:00:00')
 group by session_id ;