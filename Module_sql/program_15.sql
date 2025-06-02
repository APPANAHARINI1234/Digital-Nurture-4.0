-- Event Session Time Conflict
-- Identify overlapping sessions within the same event (i.e., session start and end times that
-- conflict).
-- A self-join is when a table is joined with itself.

-- ✅ Why use it?
-- To compare rows within the same table, especially:

-- Compare one row with another row in the same table

-- Detect duplicates, overlaps, or relationships between rows

select * from sessions;
update sessions
set event_id = 2 where session_id = 4;
update sessions
set start_time ='2025-05-15 10:00:00', end_time = '2025-05-15 12:00:00' 
where session_id = 4;
select e.event_id, e.start_time as first_session_start,e.end_time as first_session_end, t.start_time as second_session_start,
t.end_time as second_session_end
from sessions as e
join
sessions as t
on 
e.event_id = t.event_id
where ( (not e.session_id = t.session_id) and (e.end_time  between t.start_time and t.end_time));



