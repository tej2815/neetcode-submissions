-- Write your query below
-- select employee_id,salary as bonus from employees where employee_id in(
--     select employee_id from employees where employee_id%2=1 and name not like 'M%'
-- )order by employee_id

select employee_id ,case when employee_id%2=1 and name not like 'M%' then salary else 0 end as bonus from employees order by employee_id