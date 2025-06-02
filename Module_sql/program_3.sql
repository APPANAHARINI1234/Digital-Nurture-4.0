-- Retrieve users who have not registered for any events in the last 90 days.

use DigitalNurture;

select user_id from users where
 user_id not in (
   select user_id from registrations where registration_date >= curdate() - interval 90 day );
   
   -- tip how to extract day month year time are using methods like year(start_time), month(),day(),hour,minute,second