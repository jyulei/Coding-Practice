# 196. 删除重复的电子邮箱
delete from Person
where Id not in (select id from (select min(Id) as id from Person group by Email) t);