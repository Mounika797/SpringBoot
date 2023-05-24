 insert into user_details(id,birth_date,name)
 values(10001, current_date(), 'Adhi');
 
insert into user_details(id,birth_date,name)
values(10002, current_date(), 'Sunil');
 
insert into user_details(id,birth_date,name)
values(10003, current_date(), 'Shiva');

insert into post(id,description,user_id)
values(20001, 'Java Developer', 10001);

insert into post(id,description,user_id)
values(20002, 'Python Developer', 10002);

insert into post(id,description,user_id)
values(20003, 'Devops Developer', 10002);

insert into post(id,description,user_id)
values(20004, 'Powerbi Developer', 10001);