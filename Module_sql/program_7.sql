-- Low Feedback Alerts
-- List all users who gave feedback with a rating less than 3, along with their comments and
-- associated event names.

select * from feedback;
select user_id, (select title from events as eve where eve.event_id = us.event_id) ,comments , rating
from feedback as us where us.rating <= 3;