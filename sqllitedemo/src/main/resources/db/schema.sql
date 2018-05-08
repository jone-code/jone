drop table if exists city;
drop table if exists hotel;
create table city (id int, name varchar, state varchar, country varchar);
create table hotel(city int, name varchar, address varchar, zip varchar);
insert into city(id,name, state, country) values (1,'SanFrancisco', 'CA', 'US');
insert into city(id,name, state, country) values (2,'SanFrancisco', 'CA', 'US');
insert into hotel(city, name, address, zip) values (1, 'ConradTreasury Place', 'William & George Streets', '4001')