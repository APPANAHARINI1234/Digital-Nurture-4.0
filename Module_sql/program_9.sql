-- Organizer Event Summary
-- For each event organizer, show the number of events created and their current status
-- (upcoming, completed, cancelled).

select organizer_id , count(event_id), sum(status = 'upcoming'), sum(status = 'completed'), sum(status = 'cancelled')
from events
group by organizer_id;