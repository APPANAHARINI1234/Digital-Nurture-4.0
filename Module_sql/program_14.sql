-- 14. Most Registered Events
-- List top 3 events based on the total number of user registrations.

select event_id, count(registration_id) from registrations
group by event_id 
order by count(registration_id) desc
limit 3;