1. Вывести общее число жителей
select count(*) from Person

2. Вывести средний возраст жителей
select avg(Age) from Person 

3. Вывести отсортированный по алфавиту список фамилий без повторений
select distinct FirstName from Person order by 1

4. Вывести список фамилий, с указанием количества повторений этих фамилий в общем списке
select LastName, count(1) from Person  group by FirstName

5. Вывести фамилии, которые содержат в середине букву <б>
select LastName from Person where LastName like "%_б_%"

6. Вывести список <бомжей>
select FirstName from Person where Id_Street is null

7. Вывести список несовершеннолетних, проживающих на проспекте Правды
select FirstName, LastName from Person p, Street s  where  p.Id_Street = s.Id  and s.Name="проспект Правды" and p.Age < 18 

8. Вывести упорядоченный по алфавиту список всех улиц с указанием, сколько жильцов живёт на улице
select s.Name, count(p.Id_Street)  from Person p, Street s where s.Id *= p.Id_Street  Group by s.Name order by 1

9. Вывести список улиц, название которых состоит из 6-ти букв
select Name from Street where len(ltrim(rtrim(Name))) =6

10. Вывести список улиц с количеством жильцов на них меньше 3
select s.Name from Person p, Street s where s.Id *= p.Id_Street  Group by s.Name having count(p.Id_Street)  < 3
