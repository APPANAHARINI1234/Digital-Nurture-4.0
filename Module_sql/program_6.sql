-- Generate a report showing the number of resources (PDFs, images, links) uploaded for each
-- event.

select event_id, count(resource_id) from resources
group by event_id; 
