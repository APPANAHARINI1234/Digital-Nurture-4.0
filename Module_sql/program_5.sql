-- List the top 5 cities with the highest number of distinct user registrations.
select city, count(user_id) from users where user_id in (select user_id from registrations) 
group by city order by count(user_id) desc limit 3;