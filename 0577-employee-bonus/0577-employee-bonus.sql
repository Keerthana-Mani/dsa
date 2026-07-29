select e.name,b.bonus from Employee as e left join Bonus as b ON e.empId=b.empId  where b.bonus<1000 or b.bonus is NULL;
