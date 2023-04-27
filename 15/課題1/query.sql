select
    companies.name as companies_name,
    users.first_name,
    users.last_name
from
    users
inner join
    companies
on
    users.company_id = companies.id
;
