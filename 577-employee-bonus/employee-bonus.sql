-- select name,bonus from Employee e
-- left join bonus b
-- on e.empId=b.empId
-- where bonus<1000
-- or bonus is null

select name,bonus from Bonus b
right join Employee e
on e.empId=b.empId
where bonus<1000
or bonus is null