-- 13. Average Rating per City
-- Calculate the average feedback rating of events conducted in each city.

select e.city, ifnull(avg(f.rating ) ,0) from events as e
left join
feedback as f
on e.event_id = f.event_id
group by e.city;

-- use if null to do this when rating not found then we have null right then i need to have default 0 how