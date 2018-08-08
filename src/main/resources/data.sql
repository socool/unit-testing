create table if not exists item (id integer not null, name varchar(255),price integer not null,quantiy integer not null, primary key(id));
insert into item (id,name,price,quantiy) values (10001,'Item 1', 10, 50);
insert into item (id,name,price,quantiy) values (10002,'Item 2', 5, 100);
insert into item (id,name,price,quantiy) values (10003,'Item 3', 15, 75);