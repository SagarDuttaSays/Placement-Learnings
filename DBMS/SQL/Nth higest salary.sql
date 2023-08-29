select distinct salary from employee order by salary desc limit 1 offset n-1;

//if asked to print null in case there is no nth highest value

select (select distinct salary from employee order by salary desc limit 1 offset n-1;) as 'aliased column name';
