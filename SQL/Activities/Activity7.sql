REM   Script: Activity7
REM   aggregate functions

select sum(purchase_amount), avg(purchase_amount), max(purchase_amount), min(purchase_amount), count(distinct salesman_id) from orders;