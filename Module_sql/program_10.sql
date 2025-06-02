-- . Feedback Gap
-- Identify events that had registrations but received no feedback at all.

select e.event_id, e.title from events as e
where ( exists (select reg.event_id from registrations as reg where reg.event_id = e.event_id ) ) and 
 (not exists(select f.event_id from feedback as f where f.event_id = e.event_id) )

-- for seeing whether one id exists in table use select in that but it returns more than 1 answer so just add this before 'exists'