-- 11. Daily New User Count
-- Find the number of users who registered each day in the last 7 days.

select registration_date, count(registration_id) from registrations
where curdate() - interval 7 day <= registration_date and curdate() >= registration_date
group by registration_date;