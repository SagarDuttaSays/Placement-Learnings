Rank() - this ranks the records in the order specified by ORDER command OVER the select column. When there is redundancy in values of the column, the next disimilar element will be ranked which is equal to rank of redundant elements + number of redundant elements.
Eg: 90  1
    91  2
    91  2
    91  2
    94  5 (2+3)
Syntax: select rank() over (order by col_name asc/desc) as 'alias' from table_name;

Dense_Rank() - this ranks the records in the order specified by ORDER command OVER the select column. When there is redundancy in values of the column, the next disimilar element will be ranked which is equal to rank of redundant elements + 1.
Eg: 90  1
    91  2
    91  2
    91  2
    94  3 (2+1)
Syntax: select dense_rank() over (order by col_name asc/desc) as 'alias' from table_name;

Row_Number() - used to assign a serial number to the newly customized rows.
Eg: 90  1
    91  2
    91  3
    91  4
    94  5
Syntax: select row_number() over (order by col_name asc/desc) as 'alias' from table_name;

Lead() - returns the value of next row.
Syntax: lead() over(order by column_name asc/desc) from table_name;
Eg: 
Find all numbers that appear at least three times consecutively.
# Write your MySQL query statement below
select distinct l1.num as ConsecutiveNums
from logs l1, logs l2, logs l3
where 
l1.id = l2.id+1 and
l1.id = l3.id+2 and
l1.num = l2.num and
l1.num = l3.num;

Lag() -returns the value of previous row.
Syntax: lead() over(order by column_name asc/desc) from table_name;
Eg: 
Find all numbers that appear at least three times consecutively.
# Write your MySQL query statement below
select distinct l1.num as ConsecutiveNums
from logs l1, logs l2, logs l3
where 
l1.id = l2.id+1 and
l1.id = l3.id+2 and
l1.num = l2.num and
l1.num = l3.num;


